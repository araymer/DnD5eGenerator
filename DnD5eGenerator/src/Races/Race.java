/**
 * @Author Aaron Raymer
 * Race abstract class. The Race type is an object representing a character's race and the various
 * changes to the character that causes.
 */
package Races;

import java.io.Serializable;
import java.util.LinkedList;

import model.Character;

public abstract class Race implements Serializable {
	
	private Character ch;
	private LinkedList<String> racialAbilities;
	private int moveRate;
	/**
	 * 
	 * @param movement - base movement speed
	 * @return
	 * Constructor
	 */
	public Race(int movement) {
		ch = Character.getInstance();
		racialAbilities = new LinkedList<String>();
		moveRate = movement;
	}
	/**
	 * @param none
	 * @return none
	 * Abstract method to adjust stats and attributes.
	 */
	public abstract void adjustStats();
	
	/**
	 * @param none
	 * @return int - movement rate
	 * Returns the movement rate as an integer.
	 */
	public int getMoveRate() {
		return moveRate;
	}
	/**
	 * @param none
	 * @return String - returns string version of race (IE "Dwarf")
	 */
	public abstract String getRaceTitle();
	
}
