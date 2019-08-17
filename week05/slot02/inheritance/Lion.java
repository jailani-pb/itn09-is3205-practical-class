package week05.slot02.inheritance;

import week05.slot02.encapsulation.Animal;

public class Lion extends Animal {

	protected static int noOfLions = 0;
	
	public Lion(String name) {
		super(name);
		noOfLions++;
		numberOfAnimals++;
	}
	
	public String hunt() {
		return name + " is hunting.";
	}
	
	public String eat() {
		setHungerLevel(getHungerLevel() + 50);
		return hunt() + " It is now eating!";
	}

}
