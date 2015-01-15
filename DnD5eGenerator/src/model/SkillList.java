package model;

import java.io.Serializable;
import java.util.LinkedList;
import Skills.*;

public class SkillList implements Serializable {
	
	private LinkedList<Skill> skillList;
	
	
	
	public SkillList() {
		
		Skill acrobatics = new Skill("Acrobatics", Character.getInstance().getDex());
		Skill animalHandling = new Skill("Animal Handling", Character.getInstance().getWis());
		Skill arcana = new Skill("Arcana", Character.getInstance().getIntl());
		Skill athletics = new Skill("Athletics", Character.getInstance().getStr());
		Skill deception = new Skill("Deception", Character.getInstance().getCha());
		Skill history = new Skill("History", Character.getInstance().getIntl());
		Skill insight = new Skill("Insight", Character.getInstance().getWis());
		Skill intimidation = new Skill("Intimidation", Character.getInstance().getCha());
		Skill investigation = new Skill("Investigation", Character.getInstance().getIntl());
		Skill medicine = new Skill("Medicine", Character.getInstance().getWis());
		Skill nature = new Skill("Nature", Character.getInstance().getIntl());
		Skill perception = new Skill("Perception", Character.getInstance().getWis());
		Skill performance = new Skill("Performance", Character.getInstance().getCha());
		Skill persuasion = new Skill("Persuasion", Character.getInstance().getCha());
		Skill religion = new Skill("Religion", Character.getInstance().getIntl());
		Skill sleightOfHand = new Skill("Sleight of Hand", Character.getInstance().getDex());
		Skill stealth = new Skill("Stealth", Character.getInstance().getDex());
		Skill survival = new Skill("Survival", Character.getInstance().getWis());
		
		skillList = new LinkedList<Skill>();
		
		skillList.add(acrobatics);
		skillList.add(animalHandling);
		skillList.add(arcana);
		skillList.add(athletics);
		skillList.add(deception);
		skillList.add(history);
		skillList.add(insight);
		skillList.add(intimidation);
		skillList.add(investigation);
		skillList.add(medicine);
		skillList.add(nature);
		skillList.add(perception);
		skillList.add(performance);
		skillList.add(persuasion);
		skillList.add(religion);
		skillList.add(sleightOfHand);
		skillList.add(stealth);
		skillList.add(survival);
		
	}
	
	public Skill getSkill(String s) {
		for(Skill skill : skillList) {
			if(skill.getName().equals(s)) {
				return skill;
			}
		}
		
		return null;
	}
	
	public LinkedList<Skill> getSkillList() {
		return skillList;
	}
	
}
