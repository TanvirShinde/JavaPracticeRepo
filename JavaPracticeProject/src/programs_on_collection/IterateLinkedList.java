package programs_on_collection;

import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("pune");
		linkedList.add("mumbai");
		linkedList.add("bangalore");
		
		System.out.println("Linked List Elements are : " + linkedList);
		
		for (String s : linkedList) {
			System.out.println(s);
		}
	}
}
/*
OUTPUT
Linked List Elements are : [pune, mumbai, bangalore]
pune
mumbai
bangalore
*/