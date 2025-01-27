package programs_on_collection;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayToArraylistConv1 {

	public static void main(String args[]) {

		// Declaring and initializing Array
		String[] cities={"Boston", "Dallas", "New York", "Chicago"};

		//Converting Array to ArrayList using Arrays.asList()
		ArrayList<String> list= new ArrayList<>(Arrays.asList(cities));

		// Add more elements to the converted list
		list.add("San Francisco");
		list.add("San jose");

		// Print array list elements using for-each loop
		for(String s : list) {
			System.out.println(s); 
		}
	}
}
/*
OUTPUT
Boston
Dallas
New York
Chicago
San Francisco
San jose
*/