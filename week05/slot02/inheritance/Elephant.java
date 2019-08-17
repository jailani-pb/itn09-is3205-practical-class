package week05.slot02.inheritance;

import week05.slot02.encapsulation.Animal;

public class Elephant extends Animal {

	protected static int noOfElephants = 0; 
	
	public Elephant(String name) {
		super(name);
		noOfElephants++;
		numberOfAnimals++;
	}
	
	public String play() {
		return name + " is playing.";
	}
	
	public String eat(String food) {
//		setHungerLevel(getHungerLevel() + 20);
//		return name + " is eating " + food;
		return super.eat() + " " + food;
	}
	
}
