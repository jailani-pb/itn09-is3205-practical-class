package week05.slot02.encapsulation;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("ABC");
		// Encapsulated instance variable, hungerLevel
		// No direct access
//		System.out.println(animal1.hungerLevel);
		// Can only be accessed through getter or setter methods
		System.out.println(animal1.getHungerLevel());
		animal1.setHungerLevel(50);
		System.out.println(animal1.getHungerLevel());
		// Can access protected member
		System.out.println(Animal.numberOfAnimals);
	}
	
}
