package week09.slot01.datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LearningMaps {

	public static void main(String[] args) {
		HashMap<String, String> students = 
				new HashMap<String, String>();
//		LinkedHashMap<String, String> students = 
//				new LinkedHashMap<String, String>();
//		TreeMap<String, String> students =
//				new TreeMap<String, String>();
		
		students.put("A123", "Abdul");
		students.put("A099", "Rahman");
		students.put("B854", "Jailani");
		students.put("F974", "Mohammad");
		students.put("C223", "Haji");
		System.out.println(students);
		
		if(students.containsKey("F974")) {
			System.out.println("F974 already exists.");
		} else {
			students.put("F974", "Ahmad");
		}
		System.out.println(students);
		
		students.put("Z111", "Jailani");
		System.out.println(students);
		
		students.remove("B854");
		System.out.println(students);
		
		students.remove("A099", "Rahim");
		System.out.println(students);
		
		System.out.println(students.get("A123"));
		
		students.replace("C223", "Hj");
		System.out.println(students);
		
		students.replace("A099", "Rahim", "Durahman");
		System.out.println(students);
		
		System.out.println(students.keySet());
		System.out.println(students.values());
	}
	
}


