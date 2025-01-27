package programs_on_collection;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest3 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("amit");
		hs.add("sachin");
		hs.add("vaibhav");
		
		System.out.println("Hash set elements are : " + hs);
		Iterator<String> itr = hs.iterator();
		
		while (itr.hasNext()) {  
			System.out.println(itr.next());
		}
	}
}
/*
OUTPUT
Hash set elements are : [vaibhav, amit, sachin]
vaibhav
amit
sachin
*/