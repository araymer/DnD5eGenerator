package Items;


public abstract class Item {
	
	private String name;
	private double weight;
	private Size size;
	private boolean attuned;
	
	public Item(String n, double w, Size s) {
		name = n;
		weight = w;
		size = s;
		attuned = false;
	}
	
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public Size getSize() {
		return size;
	}
	
	public void toggleAttune() {
		attuned = !attuned;
	}
	
	public boolean getAttune() {
		return attuned;
	}
}
