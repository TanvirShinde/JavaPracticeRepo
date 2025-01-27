package programs_on_collection;
import java.util.ArrayList;
public class ArraylistTest {

	public static void main (String[] args){
		// Create an Integer ArrayList Object
		ArrayList<Integer> arrlist=new ArrayList<Integer>();

		// Print initial size of ArrayList
		System.out.println("Size before adding elements: "+arrlist.size());

		// Adding elements to ArrayList Object
		arrlist.add(11);
		arrlist.add(3);
		arrlist.add(5);
		arrlist.add(4);
		arrlist.add(9);
		
		/* Print size of ArrayList after adding elements */
		System.out.println("Size after adding elements: "+arrlist.size());
		
		// Removing elements from ArrayList
		arrlist.remove(1);
		arrlist.remove(2);
		
		/* Print size of ArrayList after removing elements */
		System.out.println("Size after removing elements: "+arrlist.size());
		
		// Print ArrayList
		System.out.println("Resulting ArrayList: ");
		
		for(int num: arrlist){
			System.out.println(num);
		}
	}
}
/*
OUTPUT
Size before adding elements: 0
Size after adding elements: 5
Size after removing elements: 3
Resulting ArrayList: 
11
5
9
*/