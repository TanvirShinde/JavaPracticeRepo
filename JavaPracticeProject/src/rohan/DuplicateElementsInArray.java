package rohan;

import java.util.Arrays;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		DuplicateElementsInArray a = new DuplicateElementsInArray();
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		String[] Output=a.getOriginalList(arr);
		System.out.println(Arrays.toString(Output));
	}
	
	String[] getOriginalList(String[] arr){
		int count = 0;
		for(int i=0 ; i< arr.length;i++) {
			String str = arr[i];
			for(int j=i+1; j< arr.length ;j++) {
				String str1 = arr[j];
				if(str==str1) {
					count++;
				}
			}
		}
		
		String[] Arr = new String[count];
		int k =0;
		for(int i=0 ; i< arr.length;i++) {
			String str = arr[i];
			for(int j=i+1; j< arr.length ;j++) {
				String str1 = arr[j];
				if(str==str1) {
					Arr[k++]=str1;
				}
			}
		}
		return Arr;
	}
}

/*
OUTPUT
[Harish, Krishna]
*/