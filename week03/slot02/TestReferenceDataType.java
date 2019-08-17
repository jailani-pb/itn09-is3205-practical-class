package week03.slot02;

public class TestReferenceDataType {

	public static void main(String[] args) {
		// Two data types
		// 1) Primitive data types:
		// double, float, long, int, short, byte, boolean, char
		int x = 100;
		double y = 5.0;
		boolean isItTrue = false;
		// 2) Reference data types:
		String name1 = "Jailani";
		String name2 = "Jailani";
		String name3 = new String("Jailani");
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		School sict = new School("SICT", 
				"School of Information and Communication Technology");
		School sbs = new School("SBS", "School of Business");
		School randomSchool = sbs;
		System.out.println(sict);
		System.out.println(sbs);
		System.out.println(randomSchool);
//		sbs.shortform = "SBSM";
		sbs.name = "School of Business and Marketing";
		System.out.println(sict);
		System.out.println(sbs);
		System.out.println(randomSchool);
		
		sict = null;
		randomSchool = null;
	}
	
}
