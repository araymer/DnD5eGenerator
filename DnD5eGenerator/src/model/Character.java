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
	
	private void setSaves() {
		for(int i = 0; i<6; i++) {
			
				saves[i] = abilityScores.get(i).getModifier();
				
				if(abilityScores.get(i).getProficiency())
					saves[i] += profBonus;
		}
	}
	
	public Inventory getInventory() {
		return inventory;
	}

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

	public void setAC(int mod) {
		ac+=mod;
		
	}
	
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
	
	
	public int getCharLevel() {
		charLvl = 0;
		for(int i = 0; i<charClass.size(); i++) {
			charLvl += charClass.get(i).getLevel();
		}
		
		return charLvl;
	}
	
	public static Character getInstance() {
		if(chRef == null)
			chRef = new Character();
		
		return chRef;
	}
	
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

	public void randomScoreAssignment() {
		
		Random rand = new Random();
		
		for(int i = 0; i<abilityScores.size(); i++) {
			abilityScores.get(i).setValue(rand.nextInt(15)+4);
		}
		
	}
	
	public void addInitMod(int mod) {
		init += mod;
	}
	public void setInit() {
		init = dex.getModifier();
	}
	
	public Attribute getStr() {
		return str;
	}
	public Attribute getDex() {
		return dex;
	}
	public Attribute getCon() {
		return con;
	}
	public Attribute getWis() {
		return wis;
	}
	public Attribute getIntl() {
		return intl;
	}
	public Attribute getCha() {
		return cha;
	}
	
	public LinkedList<CharClass> getCharClass() {
		return charClass;
	}
	
	
	public void addCharClass(CharClass s) {
		for(int i = 0; i<charClass.size(); i++) {
			if(charClass.get(i).getClass() == s.getClass()) {
				System.out.println("Class already exists on character profile.");
				return;
			}
		}
		charClass.add(s);
		
	}
	
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
	
	public String getCharName() {
		return charName;
	}
	public String getPlayerName() {
		return playerName;
	}
	
	
	public void setCharName(String s) {
		charName = s;
	}
	public void setPlayerName(String s) {
		playerName = s;
	}
	
	
	public void setRace(Race r) {
		charRace = r;
	}
	public void setAlignment(Alignment a) {
		charAlignment = a;
	}
	public Race getRace() {
		return charRace;
	}
	public Alignment getAlignment() {
		return charAlignment;
	}
	
	public void togglePointBuy() {
		pointBuy = !pointBuy;
	}
	
	
	
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
