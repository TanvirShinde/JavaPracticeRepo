package programs_on_collection;
import java.util.LinkedHashMap;
import java.util.Set;
public class LinkedHashMapTest {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhs = new LinkedHashMap<Integer, String>();
		lhs.put(12, "pune");
		lhs.put(15, "mumbai");
		lhs.put(19, "bangalore");
		lhs.put(17, "delhi");
		
		System.out.println("LinkedHashmap elements are : " + lhs);
		Set<Integer> s = lhs.keySet(); // s contain all the key- 12 15 19 17
		System.out.println("LinkedHashmap keySet are as : " + s);
		
		for (int a : s) {  //a contain all the keys
			System.out.println("key elements are as :>> " + a );
			System.out.println("value elements are as :>> " + lhs.get(a));
		}
	}
}
/*
OUTPUT
LinkedHashmap elements are : {12=pune, 15=mumbai, 19=bangalore, 17=delhi}
LinkedHashmap keySet are as : [12, 15, 19, 17]
key elements are as :>> 12
value elements are as :>> pune
key elements are as :>> 15
value elements are as :>> mumbai
key elements are as :>> 19
value elements are as :>> bangalore
key elements are as :>> 17
value elements are as :>> delhi
*/