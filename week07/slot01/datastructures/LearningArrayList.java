package week07.slot01.datastructures;

import java.util.ArrayList;

import week05.slot01.inheritance.Lion;

public class LearningArrayList {

	public static void main(String[] args) {
//		// ageList can only store Integer object or int data
//		ArrayList<Integer> ageList = new ArrayList<Integer>();
//		// lionList can only store Lion object
//		ArrayList<Lion> lionList = new ArrayList<Lion>();
		// nameList can only store String object
		ArrayList<String> nameList = new ArrayList<String>();
		// At the beginning, it is empty
		System.out.println(nameList.isEmpty());
		// Adding data
		// It is no longer empty
		nameList.add("A");
		System.out.println(nameList.isEmpty());
		// This add method will always add to the end of the
		// ArrayList
		nameList.add("B");
		nameList.add("C");
		System.out.println(nameList);
		// This add method will add to the specific index
		// Any data exist on and after the index will have to
		// shift to the right
		nameList.add(0, "D");
		System.out.println(nameList);
		// Check the size of the ArrayList
		System.out.println(nameList.size());
		
		nameList.add(nameList.size(), "E");
		System.out.println(nameList);
		System.out.println(nameList.size());
		// Adding data to end of ArrayList have to be
		// the next index of the last data.
//		nameList.add(6, "F"); // This will cause error.
		
		// Removing data with specific index
		nameList.remove(0);
		// Removing data with specific object
		// Will remove first occurrence of the object
		nameList.remove("B");
		System.out.println(nameList);
		
		nameList.set(1, "F");
		System.out.println(nameList);
		
		System.out.println(nameList.get(0));
		String tempData = nameList.get(nameList.size()-1);
		System.out.println(tempData);
	}
	
}







