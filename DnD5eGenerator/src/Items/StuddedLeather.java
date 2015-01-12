package Items;


public class StuddedLeather extends Armor {

	public StuddedLeather() {
		super("Studded Leather Armor", 13, Size.CARRYABLE);
		
		type = ArmorType.LIGHT;
		maxDex = 5;
		moveModifier = 0;
		acBonus = 2;
		
	}


	
}
