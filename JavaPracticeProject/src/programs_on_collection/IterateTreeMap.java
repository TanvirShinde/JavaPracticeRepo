package programs_on_collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {
	public static void main(String args[]) {

		// Declaring a TreeMap of String keys and String values
		TreeMap<String, String> treemap = new TreeMap<String, String>();

		// Add Key-Value pairs to TreeMap
		treemap.put("Key1", "Pear");
		treemap.put("Key2", "Apple");
		treemap.put("Key3", "Orange");
		treemap.put("Key4", "Papaya");
		treemap.put("Key5", "Banana");
		
		System.out.println("TreeMap elements are : " + treemap);

		// Get Set of entries
		Set set = treemap.entrySet();
		System.out.println("TreeMap elements entrySet are : " + set);
		
		// Get iterator
		Iterator it = set.iterator();

		// Show TreeMap elements
		System.out.println("TreeMap contains: ");

		while(it.hasNext()) {
			Map.Entry pair = (Entry) it.next();
			System.out.println("Key is: "+pair.getKey() + " and " + "Value is :" + pair.getValue());
		}
	}
}
/*
OUTPUT
TreeMap elements are : {Key1=Pear, Key2=Apple, Key3=Orange, Key4=Papaya, Key5=Banana}
TreeMap elements entrySet are : [Key1=Pear, Key2=Apple, Key3=Orange, Key4=Papaya, Key5=Banana]
TreeMap contains: 
Key is: Key1 and Value is :Pear
Key is: Key2 and Value is :Apple
Key is: Key3 and Value is :Orange
Key is: Key4 and Value is :Papaya
Key is: Key5 and Value is :Banana
*/