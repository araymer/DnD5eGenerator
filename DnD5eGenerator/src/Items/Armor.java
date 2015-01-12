package Items;


public abstract class Armor extends Item {
	
	protected int maxDex;
	protected int acBonus;
	protected int moveModifier;
	protected ArmorType type;
	
	public Armor(String n, double w, Size s) {
		super(n, w, s);
		
	}
	
	
	public int getMaxDex() {
		return maxDex;
	}
	
	public int getAC() {
		return acBonus;
	}
	
	public int getMoveMod() {
		return moveModifier;
	}
	public ArmorType getArmorType() {
		return type;
	}

}
