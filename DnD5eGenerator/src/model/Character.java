/**
 * @Author Aaron Raymer
 * @Class Character - This is the controller class for the character model. It is responsible for organizing
 * and maintaining all character information. This class is serializable in order to maintain
 * persistence of character info.
 */



package model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import Classes.CharClass;
import Races.Race;

public class Character implements Observer, Serializable {
	
	private static Character chRef;
	private String charName;
	private String playerName;
	private LinkedList<CharClass> charClass;
	private int profBonus, charLvl, hp, ac, init;
	private Race charRace;
	private Alignment charAlignment;
	private boolean pointBuy;
	private Inventory inventory;
	private SkillList skills;
	private LinkedList<Attribute> abilityScores;
	private Attribute str, dex, con, wis, intl, cha;
	private int[] saves;
	/**
	 * @param none
	 * @return none
	 */
	private Character() {
		
		abilityScores = new LinkedList<Attribute>();
		
		str = new Attribute("STR");
		dex = new Attribute("DEX");
		con = new Attribute("CON");
		wis = new Attribute("WIS");
		intl = new Attribute("INT");
		cha = new Attribute("CHA");
		
		abilityScores.add(str);
		abilityScores.add(dex);
		abilityScores.add(con);
		abilityScores.add(wis);
		abilityScores.add(intl);
		abilityScores.add(cha);
		
		charLvl = 0;
		setProfBonus(charLvl);
		
		inventory = new Inventory();
		
		pointBuy = false;
		saves = new int[6];
		
		charClass = new LinkedList<CharClass>();
		randomScoreAssignment();
		setAC();
		setHP();
		setSaves();
		
		
		
	}
	
	/**
	 * @param none
	 * @return void
	 * This will auto-set the "save vs" stats based on whether the character is proficient in the
	 * main attribute or not. Formula for none proficient save is simply the ability score modifier.
	 * If proficient, also add proficiency bonus.
	 */
	
	private void setSaves() {
		for(int i = 0; i<6; i++) {
			
				saves[i] = abilityScores.get(i).getModifier();
				
				if(abilityScores.get(i).getProficiency())
					saves[i] += profBonus;
		}
	}
	
	/**
	 * @param none
	 * @return Inventory - returns the character's inventory class.
	 */
	public Inventory getInventory() {
		return inventory;
	}
	
	/**
	 * @param none
	 * @return none
	 * calculates basic armor class.
	 * 
	 */
	public void setAC() {
		if(inventory.getArmor() == null)
			ac = 10 + dex.getModifier();
		else if(inventory.getArmor().getMaxDex() < dex.getModifier()) {
			if(inventory.getShield() != null)
				ac = 10 + (dex.getModifier()+(inventory.getArmor().getMaxDex()-dex.getModifier())) + inventory.getArmor().getAC() + inventory.getShield().getAC();
			else
				ac = 10 + (dex.getModifier()+(inventory.getArmor().getMaxDex()-dex.getModifier())) + inventory.getArmor().getAC();

		}
		else {
			if(inventory.getShield() != null)
				ac = 10 + dex.getModifier() + inventory.getArmor().getAC() + inventory.getShield().getAC();
			else
				ac = 10 + dex.getModifier() + inventory.getArmor().getAC();

		}
		
	}

	/**
	 * 
	 * @param mod - the number to adjust the armor class
	 * @return none
	 * Modifies armor class (this can be used for additional items that modify armor class but
	 * aren't necessarily armor).
	 */
	public void setAC(int mod) {
		ac+=mod;
		
	}
	
	/**
	 * @param none
	 * @return none
	 * Sets characters hit points based on each class's hitdie and how many levels in each class the character has.
	 */
	public void setHP() {
		
		//TODO: This needs to be updated to choose whether to take the default half+1 HP per level or randomize it.
		// This will likely require implementing a list of HP-per-level in the CharClass object so we can keep a record
		// of how hitpoints were gained. This could later be used as a feature for HP-proof.
		for(int i = 0; i<charClass.size(); i++) {
			if(charClass.get(i).getLevel() == 1) 
				hp += charClass.get(i).getHitDie() + con.getModifier();
			else
				hp += charClass.get(i).getHitDie()/2 + 1;
		}
	}
	
	/**
	 * @param none
	 * @return int - returns total character level (sum of all class levels)
	 */
	public int getCharLevel() {
		charLvl = 0;
		for(int i = 0; i<charClass.size(); i++) {
			charLvl += charClass.get(i).getLevel();
		}
		
		return charLvl;
	}
	/**
	 * @param none
	 * @return Character - returns the instance of character. This is for singleton design.
	 * 
	 */
	public static Character getInstance() {
		//TODO: maybe redesign this? Making this class singleton is handy, but could cause a problem
		//when starting a new character (unless we want to just exit the program and restart it in that case?)
		if(chRef == null)
			chRef = new Character();
		
		return chRef;
	}
	
	
	/**
	 * 
	 * @param level - takes the total character level and assigns the proficiency bonus
	 * @return none
	 */
	private void setProfBonus(int level) {
		
		if(level<5)
			profBonus = 2;
		else if(level<9)
			profBonus = 3;
		else if(level<13)
			profBonus = 4;
		else if(level<17)
			profBonus = 5;
		else if(level<=20)
			profBonus = 6;
	}
	
	/**
	 * @param none
	 * @return none
	 * 
	 * Rolls random scores for attributes from 4 to 18.
	 * 
	 **/
	public void randomScoreAssignment() {
		
		Random rand = new Random();
		
		for(int i = 0; i<abilityScores.size(); i++) {
			abilityScores.get(i).setValue(rand.nextInt(15)+4);
		}
		
	}
	
	/**
	 * 
	 * @param mod
	 * @return none
	 * Modifies Initiative value.
	 */
	
	public void addInitMod(int mod) {
		init += mod;
	}
	
	/**
	 * @param none
	 * @return none
	 * Initial assignment of Initiative value (equal to dex mod initially)
	 */
	public void setInit() {
		init = dex.getModifier();
	}
	
	/**
	 * @param none
	 * @return Attribute
	 * Returns Attribute object for Strength
	 */
	public Attribute getStr() {
		return str;
	}
	/**
	 * @param none
	 * @return Attribute
	 * Returns Attribute object for Dexterity
	 */
	public Attribute getDex() {
		return dex;
	}
	/**
	 * @param none
	 * @return Attribute
	 * Returns Attribute object for Constitution
	 */
	public Attribute getCon() {
		return con;
	}
	/**
	 * @param none
	 * @return Attribute
	 * Returns Attribute object for Wisdom
	 */
	public Attribute getWis() {
		return wis;
	}
	
	/**
	 * @param none
	 * @return Attribute
	 * Returns Attribute object for Intelligence
	 */
	public Attribute getIntl() {
		return intl;
	}
	
	/**
	 * @param none
	 * @return Attribute
	 * Returns Attribute object for Charisma
	 */
	public Attribute getCha() {
		return cha;
	}
	
	/**
	 * @param none
	 * @return LinkedList<CharClass>
	 * Returns the list of character classes assigned to this character.
	 */
	public LinkedList<CharClass> getCharClass() {
		return charClass;
	}
	
	/**
	 * 
	 * @param s
	 * @return none
	 * Adds a character class if that class has not already been added and the character
	 * is not at max level (20).
	 * 
	 */
	public void addCharClass(CharClass s) {
		for(int i = 0; i<charClass.size(); i++) {
			if(charClass.get(i).getClass() == s.getClass() || charLvl >= 20) {
				System.out.println("Class already exists on character profile.");
				return;
			}
		}
		charClass.add(s);
		
	}
	
	/**
	 * 
	 * @param s - class to remove
	 * @return none
	 * 
	 * Removes a class if a character class is assigned to this character and there is more than one character class
	 * NOTE: will remove class even if above level 1.
	 * 
	 */
	//TODO: possibly add in confirmation dialog before removing a class?
	public void removeCharClass(CharClass s) {
		for(int i = 0; i<charClass.size(); i++) {
			if(charClass.get(i).getClass() == s.getClass() && charClass.size() > 1) {
				charClass.get(i).undoClass();
				charClass.remove(i);
				
				//TODO: add functionality to remove all class abilities/modifiers and such upon class removal.
				return;
			
			}
		}
	}
	/**
	 * @param none
	 * @return String
	 * Returns character name.
	 */
	public String getCharName() {
		return charName;
	}
	/**
	 * @param none
	 * @return String
	 * Returns player's name
	 */
	public String getPlayerName() {
		return playerName;
	}
	
	/**
	 * 
	 * @param s
	 * @return none
	 * Sets character name.
	 */
	public void setCharName(String s) {
		charName = s;
	}
	/**
	 * 
	 * @param s
	 * @return none
	 * Sets player's name.
	 */
	public void setPlayerName(String s) {
		playerName = s;
	}
	
	/**
	 * 
	 * @param r - Race type.
	 * @return none
	 * Sets the character's race.
	 * 
	 */
	public void setRace(Race r) {
		charRace = r;
	}
	/**
	 * 
	 * @param a - Alignment enum
	 * @return none
	 * Sets the character's alignment.
	 */
	public void setAlignment(Alignment a) {
		charAlignment = a;
	}
	/**
	 * @param none
	 * @return Race type
	 * Returns the character's race.
	 */
	public Race getRace() {
		return charRace;
	}
	/**
	 * @param none
	 * @return Alignment type
	 * Returns character's alignment.
	 */
	public Alignment getAlignment() {
		return charAlignment;
	}
	/**
	 * @param none
	 * @return none
	 * toggles pointBuy boolean options. This determines whether the attributes will be
	 * bought from a pool or rolled randomly. 
	 */
	public void togglePointBuy() {
		pointBuy = !pointBuy;
	}
	
	
	/**
	 * @param none
	 * @return none
	 * Character toString
	 */
	public String toString() {
		String string = "";
		
		string = "\n\n-------------------------------\nPlayer: " + playerName + "\nCharacter "
				+ "Name: " + charName + "\nRace: " + charRace.getRaceTitle() + "\nClass: ";
		for(int i = 0; i<charClass.size(); i++) {
			string+= charClass.get(i).getClassTitle() + " " + charClass.get(i).getLevel() + " ";
		}
		
		string+= "\nArmor Class: " + ac + "\nHit Points: " + hp + "\nInitiative: " + init;
		
		
		string+= "\nAlignment: " + charAlignment + "\n\nProficiency Bonus: " + profBonus +"\n\nAttributes\nSTR: \t" + str + "\t| " + str.getModifier() + "\nDEX: \t" + dex + "\t| " + dex.getModifier() + "\nCON: \t" + con + "\t| " + con.getModifier()  + "\nWIS: \t" + wis + "\t| " + wis.getModifier() + "\nINT: \t" + intl + "\t| " + intl.getModifier() + "\nCHA: \t" + cha + "\t| " + cha.getModifier();
		
		string+= "\n\nSaving Throws";
		
		for(int i = 0; i<saves.length; i++) {
			string+= "\n" + abilityScores.get(i).getName() + ": " + saves[i];
		}
		
		return string;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
