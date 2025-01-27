package programs_on_collection;
import java.util.TreeSet;
public class TreeSetTest1 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
	
		ts.add(55);
		ts.add(25);
		ts.add(35);
		ts.add(20);
		ts.add(50);
		
		ts.add(35); // duplicats are added
		//ts.add("pune"); //adding the heterogenous object
		System.out.println("Treeset elements are as :" + ts);
	}
}
/*
OUTPUT
Treeset elements are as :[20, 25, 35, 50, 55]
*/