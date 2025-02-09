package programs_on_collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LinkedListToArrayListConv1 {

	public static void main(String args[]) {
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Mango");
		linkedlist.add("Banana"); 
		linkedlist.add("Pear");
		linkedlist.add("Apple");
		linkedlist.add("Orange");

		// Converting LinkedList to ArrayList
		List<String> list = new ArrayList(linkedlist);
		for (String s : list) {
			System.out.println(s);
		} 
	}
}
/*
OUTPUT
Mango
Banana
Pear
Apple
Orange
*/