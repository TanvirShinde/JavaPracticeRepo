package programs_on_collection;
import java.util.HashMap;
import java.util.Set;
public class HashMapTest3 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(12, "rohit");
		hm.put(16, "ajit");
		hm.put(21, "atul");
		
		System.out.println("Hashmap elements are : " + hm );
		Set<Integer> s = hm.keySet(); // we can't directly iterate // s contain all the keys only- 12,16,21
		System.out.println("Hashmap's key values are : " + s);
		
		for (Integer i : s) {
			System.out.println("Keys are :>> " + i); // 12
			System.out.println("values are :>> " + hm.get(i)); // hm.get(12)---->rohit
		}
	}
}
/*
OUTPUT
Hashmap elements are : {16=ajit, 21=atul, 12=rohit}
Hashmap's key values are : [16, 21, 12]
Keys are :>> 16
values are :>> ajit
Keys are :>> 21
values are :>> atul
Keys are :>> 12
values are :>> rohit
*/