package rohan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]

 */
public class DuplicateElementsInArray2 {

	public static void main(String[] args) {
		DuplicateElementsInArray2 a = new DuplicateElementsInArray2();
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		a.getOriginalList(arr);
	}
	List<String>getOriginalList(String[] arr){
		List<String> OriginalList = Arrays.asList(arr);
		List<String> tempList = new ArrayList<String>(OriginalList);
		List<String> OutList = new ArrayList<String>();
		for(int i=0 ;i< OriginalList.size();i++) {
			String A = tempList.get(i);
			if(tempList.indexOf(A)!=tempList.lastIndexOf(A) && i==tempList.indexOf(A)) {
				OutList.add(A);
			}
		}
		System.out.println(OutList);
		return tempList;
	}
}
/*
OUTPUT
[Harish, Krishna]
*/