package week07.slot01.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		System.out.println(nameList.isEmpty());
		
		nameList.addFirst("A");
		nameList.addLast("B");
		nameList.addFirst("C");
		System.out.println(nameList);
		nameList.add("D");
		nameList.add("E");
		System.out.println(nameList);
		
		String tempData = nameList.removeFirst();
		System.out.println(tempData);
		System.out.println(nameList);
		
		ListIterator<String> listIterator = nameList.listIterator();
		
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
//		System.out.println(listIterator.next());
		if(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		listIterator.next();
		listIterator.next();
		
		listIterator.add("F");
		System.out.println(nameList);
		System.out.println(listIterator.next());
		
		listIterator.remove();
		System.out.println(nameList);
		// ListIterator has to select a data
		// using next or previous before removing
//		listIterator.remove();
		
		listIterator.previous();
		listIterator.set("G");
		System.out.println(nameList);
		
		System.out.println(nameList.get(3));
		nameList.remove("B");
		nameList.remove(1);
		nameList.set(0, "H");
		System.out.println(nameList);
	}
	
}
