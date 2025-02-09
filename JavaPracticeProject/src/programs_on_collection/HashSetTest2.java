package programs_on_collection;
import java.util.HashSet;
public class HashSetTest2 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(15);
		hs.add(10);
		hs.add(25);
		hs.add(20);
		
		System.out.println("Hashset elements are :" + hs);

		// for each loop or for enhanced loop
		for (Integer a : hs) {
			System.out.println(a);
		}
	}
}
/*
OUTPUT
Hashset elements are :[20, 25, 10, 15]
20
25
10
15
*/