package programs_on_collection;
import java.util.HashSet;
import java.util.Iterator;
public class IterateHashset {

	public static void main(String args[]) {

		
		HashSet<String> hashset = new HashSet<String>();
		
		// Add elements to HashSet
		hashset.add("Pear");
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("Papaya");
		hashset.add("Banana"); 
		
		System.out.println("Hashset elements are : " + hashset);
		
		// Get iterator
		Iterator<String> it = hashset.iterator();
		
		// Show HashSet elements
		System.out.println("HashSet contains: ");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
/*
OUTPUT
Hashset elements are : [Apple, Pear, Papaya, Orange, Banana]
HashSet contains: 
Apple
Pear
Papaya
Orange
Banana
*/
