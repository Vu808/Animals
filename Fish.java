
public class Fish extends Animals implements Pet {

	String name;
	
	public Fish() {
		super(0);
		name = "Piscene";
		
	}
	
	public String walk() {
		String walk;
		walk = "Fish dont have legs and cant walk";
		return walk;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("The fish enjoys swimming around");
	}
	
	public String eat() {
		return "Eats Fish food";
	}
}
