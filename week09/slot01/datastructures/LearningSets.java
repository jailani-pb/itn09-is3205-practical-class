package week09.slot01.datastructures;

import java.util.*;

public class LearningSets {

	public static void main(String[] args) {
//		HashSet<String> id = new HashSet<String>();
//		LinkedHashSet<String> id = new LinkedHashSet<String>();
		TreeSet<String> id = new TreeSet<String>();
		
		id.add("A123");
		id.add("A099");
		id.add("B854");
		id.add("F974");
		id.add("C223");
		System.out.println(id);
		
		id.add("B854");
		System.out.println(id);
		
		System.out.println(id.contains("A123"));
		System.out.println(id.contains("Z111"));
		
		id.remove("F974");
		System.out.println(id);
		
		for(String e : id) {
			System.out.println(e);
		}
	}
	
}
