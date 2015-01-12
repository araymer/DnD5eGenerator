package model;

public class Attribute  {
	
	private int value;
	private int mod;
	private boolean prof;
	private String name;
	
	public Attribute(String n) {
		
		value = 0;
		mod = 0;
		prof = false;
		name = n;
		
	}
	
	public Attribute(int v, int m, boolean p) {
		
		value = v;
		mod = m;
		prof = p;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return value + "";	//lazy toString fix
	}
	public int getModifier() {
		return mod;
	}
	public boolean getProficiency() {
		return prof;
	}
	
	public void setValue(int v) {
		value = v;
		adjustModifier();
		
	}
	public void adjustModifier() {
			mod = (value - 10)/2;
	}
	public void toggleProficiency() {
		prof = !prof;
	}
	
}
