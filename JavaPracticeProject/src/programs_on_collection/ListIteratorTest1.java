package programs_on_collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorTest1 {

	public static void main(String[] args) {

		ArrayList<Integer> e = new ArrayList<Integer>();

		for (int i=0 ; i<=10 ; i++) {
			e.add(i);
		}

		System.out.println("Arraylist element are as : " + e);
		ListIterator<Integer> js = e.listIterator();

		while (js.hasNext()) {
			Integer ss = js.next();
			if (ss.equals(2)) {
				js.add(27);
			}
		}

		System.out.println("Arraylist element are as after iterate : " + e);
	}
}
/*
OUTPUT
Arraylist element are as : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Arraylist element are as after iterate : [0, 1, 2, 27, 3, 4, 5, 6, 7, 8, 9, 10]
*/