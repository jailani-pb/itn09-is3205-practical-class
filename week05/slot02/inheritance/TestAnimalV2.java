package week05.slot02.inheritance;

import week05.slot02.encapsulation.Animal;

public class TestAnimalV2 {

	public static void main(String[] args) {
		// Animal is in different package as this class.
		// Cannot directly access members with protected keyword.
//		System.out.println(Animal.numberOfAnimals);
		
		Lion lion1 = new Lion("ABC");
		// Lion is subclass of Animal
		// All visible class's members in Animal will be inherited.
		System.out.println(lion1.name);
		System.out.println(lion1.getHungerLevel());
		lion1.setHungerLevel(1000);
		System.out.println(lion1.getHungerLevel());
		System.out.println(lion1.eat());
		// Lion own method
		System.out.println(lion1.hunt());
		// Lion cannot invoke Elephant's method, play()
//		System.out.println(lion1.play());
		
		Elephant elephant1 = new Elephant("DEF");
		// Elephant is subclass of Animal
		System.out.println(elephant1.name);
		System.out.println(elephant1.getHungerLevel());
		elephant1.setHungerLevel(10);
		System.out.println(elephant1.getHungerLevel());
		System.out.println(elephant1.eat());
		// Elephant own method
		System.out.println(elephant1.play());
		System.out.println(elephant1.eat("leaves"));
		// Elephant cannot invoke Lion's method, hunt()
//		System.out.println(elephant1.hunt());
	}
	
}
