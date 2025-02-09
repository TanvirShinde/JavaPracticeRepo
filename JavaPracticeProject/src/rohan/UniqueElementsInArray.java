package rohan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Return the list of unique names from given Array. [IMP]
String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : [Pramod, Jeet]
 */

public class UniqueElementsInArray {

	public static void main(String[] args) {
		UniqueElementsInArray a = new UniqueElementsInArray();
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		a.getUniqueNameList(arr);
	}
	List<String> getUniqueNameList (String[] arr) {
		List<String> UniqueNameList	= Arrays.asList(arr);
		List<String> TempList = new ArrayList<String>();
		for(int i=0;i<UniqueNameList.size();i++) {
			String A = UniqueNameList.get(i);
			if(UniqueNameList.indexOf(A)==UniqueNameList.lastIndexOf(A) ) {
				TempList.add(A);
			}
		}
		System.out.println(TempList);
		return TempList;

	}
}
/*
OUTPUT
[Pramod, Jeet]
*/