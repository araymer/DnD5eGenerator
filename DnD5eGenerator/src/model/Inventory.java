/**
 * @Author Aaron Raymer
 * @Class Inventory - represents the characters standing inventory and controls what is added to
 * and removed from the inventory. All items extend the Item class and attuneable items must be 
 * marked as such in their superclass.
 */

package model;

import java.io.Serializable;
import java.util.LinkedList;

import Items.Armor;
import Items.Item;

public class Inventory implements Serializable {
	
	private Armor armor;
	private Armor shield;
	private Item weapon1, weapon2, weaponRanged;
	private LinkedList<Item> carriedItems;
	private LinkedList<Item> wornItems;
	private int attunedCount;
	
	/**
	 * 
	 */
	public Inventory() {
		
		carriedItems = new LinkedList<Item>();
		wornItems = new LinkedList<Item>();
		attunedCount = 0;
	}
	
	
	public Armor getArmor() {
		return armor;
	}
	
	public Armor getShield() {
		return shield;
	}
	
	public Item getMainHand() {
		return weapon1;
	}
	
	public Item getOffHand() {
		return weapon2;
	}
	
	public Item getRanged() {
		return weaponRanged;
	}
	
	public LinkedList<Item> getWornItems() {
		return wornItems;
	}
	
	public LinkedList<Item> getCarriedItems() {
		return carriedItems;
	}
	
	public void addMainHand(Item mainHand) {
		
	}
	
	public void addOffHand() {
		
	}
	
	public void addShield() {
		
	}
	
	public void addRanged() {
		
	}
	
	public void addArmor(Armor a) {
		
		if(!armor.getAttune() || attunedCount <= 3) {
			armor = a;
			Character.getInstance().setAC();
		}
		
		if(armor.getAttune())
			attunedCount++;
	}
	
	public void removeMainHand() {
		
	}
	
	public void removeOffHand() {
		
	}
	
	public void removeShield() {
		
	}
	
	public void removeRanged() {
		
	}
	
	public void removeArmor() {
		armor = null;
		Character.getInstance().setAC();
	}
	
	public void carryItem() {
		
	}
	
	public void dropItem() {
		
	}
	
	public void wearItem() {
		
	}
	
	public void takeOffItem() {
		
	}
}
