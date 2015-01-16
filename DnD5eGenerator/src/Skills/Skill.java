package Skills;

import model.*;
import model.Character;

public class Skill {
	private String skillName;
	private Attribute skillStat;
	private boolean prof;
	private int total;
	private int miscBonus;
	
	public Skill(String string, Attribute stat) {
		skillName = string;
		skillStat = stat;
		this.prof = false;
		total = skillStat.getModifier();
		
	}

	
	public String getName() {
		return skillName;
	}
	
	public void addBonus(int n) {
		miscBonus+=n;
	}
	
	public int getTotal() {
		if(!prof)
			return total + miscBonus;
		else
			return total + Character.getInstance().getProficiency() + miscBonus;
	}
}
