package programs_on_collection;
import java.util.HashMap;
public class HashMapTest2 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		// how to add the elements-
		hm.put(15, "ajay"); //15 is key and ajay is the value
		hm.put(17, "sachin"); //override with existing one
		hm.put(20, "vaibhav");
		
		System.out.println(hm);
	}
}
/*
OUTPUT
{17=sachin, 20=vaibhav, 15=ajay}
*/