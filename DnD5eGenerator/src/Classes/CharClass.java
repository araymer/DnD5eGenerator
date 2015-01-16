/**
 * @author Aaron Raymer
 * CharClass abstract class - represents the various classes that can be added to the Character object and
 * its aspects, including current level, hitdie, and various proficiencies and abilities.
 */

package Classes;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

import model.ClassAbilities;

public abstract class CharClass implements Serializable {
	
	private int hitDie, level;
	protected LinkedList<String> weaponProf;
	protected LinkedList<String> armorProf;
	protected LinkedList<String> skillProf;
	protected LinkedList<ClassAbilities> classAbilities;
	
	/**
	 * 
	 * @param hD - hitDie
	 * @return none
	 * Constructor - assigns hitDie
	 */
	public CharClass(int hD) {
		hitDie = hD;
		weaponProf = new LinkedList<String>();
		armorProf =  new LinkedList<String>();
		skillProf =  new LinkedList<String>();
		level = 1;
		classAbilities = new LinkedList<ClassAbilities>();
	}
	

	/**
	 * @param none
	 * @return int
	 * Returns current level of class
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param none
	 * @return none
	 * Increments level and adjusts Character object. 
	 */
	public void levelUp() {
		level++;
		adjustLevel();
	}
	/**
	 * @param none
	 * @return int
	 * returns the hitdie value for the class.
	 */
	public int getHitDie() {
		return hitDie;
	}
	/**
	 * @param none
	 * @return none
	 * Abstract - Makes adjustments to the Character object in accordance with the class level.
	 */
	public abstract void adjustLevel();
	/**
	 * @param none
	 * @return String
	 * Returns with String version of class (IE "Ranger")
	 */
	public abstract String getClassTitle();
	/**
	 * @param none
	 * @return none
	 * Undoes all changes to character done by this class
	 */
	public abstract void undoClass();
	

}
