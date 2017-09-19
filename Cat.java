
public class Cat extends Animals implements Pet  {

	String name;
	
	public Cat(String name) {
		super(4);
	this.name = name;
		}
	
	public Cat() {
		super(4);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("The cat is now playing!");
	}
	
	public String eat() {
		return "Eats fish";
	}
}
