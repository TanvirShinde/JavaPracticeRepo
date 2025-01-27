package programs_on_collection;
import java.util.HashMap;
public class IterateHashmap1 {

	public static void main(String args[]) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Key1", "Value1");
		hashmap.put("Key2", "Value2");
		
		System.out.println("Hashmap elements are : " + hashmap.keySet());
		System.out.println("Iterating or looping map using foreach loop");

		// Iterating or looping using keySet() method
		for (String key : hashmap.keySet()) {
			System.out.println("key: " + key + " value: " + hashmap.get(key));
		}
	}
}
/*
OUTPUT
Hashmap elements are : [Key2, Key1]
Iterating or looping map using foreach loop
key: Key2 value: Value2
key: Key1 value: Value1
*/