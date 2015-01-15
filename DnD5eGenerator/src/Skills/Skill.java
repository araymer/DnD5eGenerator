package Skills;

import model.Attribute;

public class Skill {
	private String skillName;
	private Attribute skillStat;
	private boolean prof;
	private int total;
	
	public Skill(String string, Attribute stat) {
		skillName = string;
		skillStat = stat;
		this.prof = false;
	}

	
	public String getName() {
		return skillName;
	}
}
