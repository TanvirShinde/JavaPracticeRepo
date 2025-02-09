package rohan;

import java.util.ArrayList;
import java.util.List;
/*
 * find first unique number from given series
input = {66,12,69,12,77,66,69,8,5,14}
output : First unique number is 77
 */
public class UniqueNumberInArray {

	public static void main(String[] args) {
		UniqueNumberInArray ch = new UniqueNumberInArray();
		int[] input = { 66, 12, 69, 12, 77, 66, 69, 8, 5, 14 };
		ch.getUnique(input);
	}

	List<Integer> getOrginalList(int[] arr) {
		List<Integer> OriginalList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			OriginalList.add(arr[i]);
		}
		return OriginalList;
	}
	
	List<Integer>getUnique(int[] arr){
		List<Integer>Unique = getOrginalList(arr);
		for(int i=0;i<Unique.size();i++) {
			int A = Unique.get(i);
			if(Unique.indexOf(A)==Unique.lastIndexOf(A)) {
				System.out.println("First unique number is "+A);
				break;
			}
		}
		return Unique;
	}
}
/*
OUTPUT
First unique number is 77
*/