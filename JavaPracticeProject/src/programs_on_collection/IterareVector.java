package programs_on_collection;
import java.util.Vector;
public class IterareVector {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("mumbai");
		v.add("pune");
		v.add("bangalore");
		
		System.out.println("Vector elements are as : " + v);

		for (String s : v) {
			System.out.println("Vector element are iterate as :" + s);
		}
	}
}
/*
OUTPUT
Vector elements are as : [mumbai, pune, bangalore]
Vector element are iterate as :mumbai
Vector element are iterate as :pune
Vector element are iterate as :bangalore
*/