package week05.slot02.inheritance;

import week05.slot02.encapsulation.Animal;

public class Giraffe extends Animal {

	protected static int noOfGiraffe = 0;
	
	public Giraffe(String name) {
		super(name);
		noOfGiraffe++;
		numberOfAnimals++;
	}
	
}
