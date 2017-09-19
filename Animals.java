
public abstract class Animals {
	
	protected int legs;
	
	protected Animals(int legs) {
		this.legs = legs;
	}
	
	public abstract String eat();
	
	public String walk() {
		String walk;
		walk = "This animal walks with " + legs + " legs.";
		return walk;
	}
	
}
