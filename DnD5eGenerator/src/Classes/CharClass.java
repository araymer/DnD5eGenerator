package Classes;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

public abstract class CharClass implements Serializable {
	
	private int hitDie, level;
	protected LinkedList<String> weaponProf;
	protected LinkedList<String> armorProf;
	protected LinkedList<String> skillProf;
	protected HashMap<String, String> classAbilities;
	
	
	public CharClass(int hD) {
		hitDie = hD;
		weaponProf = new LinkedList<String>();
		armorProf =  new LinkedList<String>();
		skillProf =  new LinkedList<String>();
		level = 1;
		classAbilities = new HashMap<String, String>();
	}
	


	public int getLevel() {
		return level;
	}
	
	public void levelUp() {
		level++;
		adjustLevel();
	}
	
	public int getHitDie() {
		return hitDie;
	}
	public abstract void adjustLevel();
	
	public abstract String getClassTitle();
	
	public abstract void undoClass();
	
	

	

}
