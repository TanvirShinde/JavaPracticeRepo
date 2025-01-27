package programs_on_collection;
import java.util.ArrayList;
import java.util.Iterator;
public class IterateCursor {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i=0 ; i<=10 ;i++) {
			al.add(i);
		}

		System.out.println("Arraylist element are : " + al);
		Iterator<Integer> e = al.iterator();

		while (e.hasNext()) {
			Integer s = e.next();
			if(s%2==0) {
				System.out.println(s);
			}
			else {
				e.remove();
			}
		}
		System.out.println("Arraylist element are : " + al);
	}
}
/*
OUTPUT
Arraylist element are : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
0
2
4
6
8
10
Arraylist element are : [0, 2, 4, 6, 8, 10]
*/