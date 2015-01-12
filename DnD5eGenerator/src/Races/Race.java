package Races;

import java.io.Serializable;
import java.util.LinkedList;

import model.Character;

public abstract class Race implements Serializable {
	
	private Character ch;
	private LinkedList<String> racialAbilities;
	private int moveRate;
	
	public Race(int movement) {
		ch = Character.getInstance();
		racialAbilities = new LinkedList<String>();
		moveRate = movement;
	}
	public abstract void adjustStats();
	
	public int getMoveRate() {
		return moveRate;
	}
	
	public abstract String getRaceTitle();
	
}
