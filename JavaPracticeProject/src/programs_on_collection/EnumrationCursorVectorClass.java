package programs_on_collection;
import java.util.Enumeration;
import java.util.Vector;
public class EnumrationCursorVectorClass {

	public static void main(String[] args) {

		Vector<Integer> al = new Vector<Integer>();
		al.add(10);
		al.addElement(20);
		al.addElement(12);
		al.add(23);

		System.out.println(al);
		Enumeration<Integer> e = al.elements();

		while (e.hasMoreElements()) {
			Integer i =e.nextElement();
			System.out.println(i);
		}
	}
}
/*
OUTPUT
[10, 20, 12, 23]
10
20
12
23
*/