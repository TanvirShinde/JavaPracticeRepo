package programs_on_collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedhSet = new LinkedHashSet<String>();
		linkedhSet.add("laptop");
		linkedhSet.add("mobile");
		linkedhSet.add("headphone");

		Iterator<String> itr = linkedhSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
/*
OUTPUT
laptop
mobile
headphone
*/