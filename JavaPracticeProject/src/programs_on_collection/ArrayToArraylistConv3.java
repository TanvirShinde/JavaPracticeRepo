package programs_on_collection;
import java.util.ArrayList;
public class ArrayToArraylistConv3 {

	public static void main(String args[]) {
		// Declaring and instantiating ArrayList in one step
		ArrayList<String> al = new ArrayList();

		// Given initialized array
		String[] strArray = {"Cocacola", "Pepsi", "Fanta", "Dr Pepper"};

		//Converting Array to ArrayList manually
		for (int i=0; i < strArray.length ; i++) {
			// Adding every element of array to the ArrayList 
			al.add(strArray[i]);
		}

		// Showing array list elements using for-each loop
		for(String str1 : al) {
			System.out.println(str1); 
		}
	}
}
/*
OUTPUT
Cocacola
Pepsi
Fanta
Dr Pepper
*/