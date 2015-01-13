/**
 * @Author Aaron Raymer
 * @Class Inventory - represents the characters standing inventory and controls what is added to
 * and removed from the inventory. All items extend the Item class and attuneable items must be 
 * marked as such in their superclass.
 */

package model;

import java.io.Serializable;
import java.util.LinkedList;

import Items.*;


public class Inventory implements Serializable {
	
	private Armor armor;
	private Shield shield;
	private Weapon weapon1, weapon2, weaponRanged;
	private LinkedList<Item> carriedItems;
	private LinkedList<Item> wornItems;
	private int attunedCount;
	
	/**
	 * Constructor
	 */
	public Inventory() {
		
		carriedItems = new LinkedList<Item>();
		wornItems = new LinkedList<Item>();
		attunedCount = 0;
		armor = new BlankArmor();
		shield = new BlankShield();
	}
	
	/**
	 * @param none
	 * @return Armor type
	 * Returns the character's armor.
	 */
	public Armor getArmor() {
		return armor;
	}
	/**
	 * @param none
	 * @return Shield type
	 * Returns the character's shield.
	 */
	public Shield getShield() {
		return shield;
	}
	/**
	 * @param none
	 * @return Weapon type
	 * Returns the character's main weapon.
	 */
	public Weapon getMainHand() {
		return weapon1;
	}
	/**
	 * @param none
	 * @return Weapon type
	 * Returns the character's secondary weapon.
	 */
	public Weapon getOffHand() {
		return weapon2;
	}
	
	/**
	 * @param none
	 * @return Weapon type
	 * Returns the character's ranged weapon.
	 */
	public Weapon getRanged() {
		return weaponRanged;
	}
	
	/**
	 * @param none
	 * @return LinkedList<Item>
	 * Returns a list of worn items.
	 */
	public LinkedList<Item> getWornItems() {
		return wornItems;
	}
	/**
	 * @param none
	 * @return LinkedList<Item>
	 * Returns a list of carried items.
	 */
	public LinkedList<Item> getCarriedItems() {
		return carriedItems;
	}
	/**
	 * 
	 * @param mainHand - Weapon type
	 * @return none
	 * Adds a weapon to the main hand
	 * 
	 */
	public void addMainHand(Weapon main) {
		
	}
	/**
	 * 
	 * @param mainHand - Weapon type
	 * @return none
	 * Adds a weapon to the off hand
	 * 
	 */
	public void addOffHand(Weapon off) {
		
	}
	
	/**
	 * @param sh - Shield type
	 * @return none
	 * Adds a shield to shield slot
	 */
	public void addShield(Shield sh) {
		
	}
	
	/**
	 * @param rng - Weapon type
	 * @return none
	 * Adds a ranged weapon to ranged slot
	 */
	public void addRanged() {
		
	}
	
	/**
	 * 
	 * @param a - Armor type
	 * @return none
	 * Adds armor to armor slot.
	 */
	public void addArmor(Armor a) {
		
		
		if(!armor.getAttune() || attunedCount <= 3) {
			armor = a;
			Character.getInstance().setAC();
		}
		
		if(armor.getAttune())
			attunedCount++;
	}
	
	/**
	 * @param none
	 * @return none
	 * Removes main weapon
	 */
	public void removeMainHand() {
		
	}
	/**
	 * @param none
	 * @return none
	 * Removes secondary weapon
	 */
	public void removeOffHand() {
		
	}
	/**
	 * @param none
	 * @return none
	 * Removes shield
	 */
	public void removeShield() {
		
	}
	
	/**
	 * @param none
	 * @return none
	 * Removes ranged weapon
	 */
	public void removeRanged() {
		
	}
	/**
	 * @param none
	 * @return none
	 * Removes armor
	 */
	public void removeArmor() {
		armor = null;
		Character.getInstance().setAC();
	}
	/**
	 * @param i - Item type
	 * @return none
	 * Adds an item to the carriedItems list
	 */
	public void carryItem(Item i) {
		
	}
	/**
	 * @param i - Item type
	 * @return boolean - success/failure
	 * Drops an item type from the carriedItems list.
	 */
	public boolean dropItem(Item i) {
		return false;
	}
	/**
	 * @param i - Item type
	 * @return none
	 * Adds an item to the wornItems list
	 */
	public void wearItem(Item i) {
		
	}
	
	/**
	 * @param i - Item type
	 * @return none
	 * Removes an Item from the wornItems list
	 */
	
	public void takeOffItem(Item i) {
		
	}
}
