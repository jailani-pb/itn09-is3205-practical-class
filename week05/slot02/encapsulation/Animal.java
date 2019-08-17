package week05.slot02.encapsulation;

public class Animal {

	private int hungerLevel;
	public String name;
	protected static int numberOfAnimals = 0;
	
	public Animal(String name) {
		this.name = name;
		this.setHungerLevel(0);
	}
	
	public int getHungerLevel() {
		return hungerLevel;
	}
	
	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
		if(this.hungerLevel < 0) {
			this.hungerLevel = 0;
		}
		if(this.hungerLevel > 100) {
			this.hungerLevel = 100;
		}
	}
	
	public String eat() {
		setHungerLevel(hungerLevel + 20);
		return name + " is eating";
	}
	
}
