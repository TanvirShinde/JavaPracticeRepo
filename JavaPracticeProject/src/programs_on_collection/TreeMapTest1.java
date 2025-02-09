package programs_on_collection;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest1 {

	public static void main(String[] args) {

		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		tm.put("ram", "patil");
		tm.put("ajay", "deshmukh");
		tm.put("sohan", "pawar");
		
		System.out.println("Tree map elements are as : " + tm);
		Set<String> s = tm.keySet();
		
		for (String str : s) {
			System.out.println("key as : " + str + "Value as : " + tm.get(str));
			
		}
	}
}
/*
OUTPUT
Tree map elements are as : {ajay=deshmukh, ram=patil, sohan=pawar}
key as : ajayValue as : deshmukh
key as : ramValue as : patil
key as : sohanValue as : pawar
*/