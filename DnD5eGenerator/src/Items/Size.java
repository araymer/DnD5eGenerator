package Items;

public enum Size {
	NA(0), TINY(0), POCKETSIZED(1), CONTAINERSIZED(2), CARRYABLE(3), BULKY(4), HAULSIZED(5);
	
	private int rating;
	private Size(int v) {
		rating = v;
	}
}
