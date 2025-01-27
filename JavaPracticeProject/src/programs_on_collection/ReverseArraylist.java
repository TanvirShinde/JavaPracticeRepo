package programs_on_collection;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseArraylist {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>(); 

		arrlist.add("Apple"); 
		arrlist.add("Amazon"); 
		arrlist.add("Facebook");
		arrlist.add("Google");
		arrlist.add("IBM"); 
		arrlist.add("Tesla");

		System.out.println("Before Reverse ArrayList:"); 
		System.out.println(arrlist);
		Collections.reverse(arrlist);
		System.out.println("After Reverse ArrayList:"); 
		System.out.println(arrlist);
	}
}
/*
OUTPUT
Before Reverse ArrayList:
[Apple, Amazon, Facebook, Google, IBM, Tesla]
After Reverse ArrayList:
[Tesla, IBM, Google, Facebook, Amazon, Apple]
*/
