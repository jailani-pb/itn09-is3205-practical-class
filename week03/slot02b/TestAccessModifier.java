package week03.slot02b;

import week03.slot02.School;

public class TestAccessModifier {

	public static void main(String[] args) {
		School sict = new School("SICTABCD", "School of ICT");
		System.out.println(sict.getShortform());
//		sict.shortform = "ABCDEFGHIJ";
//		sict.setShortform("ABCDEFGHIJ");
		System.out.println(sict);
//		System.out.println(sict.name);
		// We want Student class from package week2
		week02.Student student1 = new week02.Student("123", "ABC");
		// We want Student class from package week3.slot1
		week03.slot01.Student student2 = 
				new week03.slot01.Student("456", "DEF", 2000, 'A');
		
	}
	
}
