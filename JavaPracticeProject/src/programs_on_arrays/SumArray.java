package programs_on_arrays;
import java.util.Arrays;
public class SumArray {
	public static void main(String[] args) { 
		SumArray sum = new SumArray(); 
		int[] input = {1,2,3,4,5}; 
		int[] Output = sum.SumOfRemain(input); 
		System.out.println(Arrays.toString(Output)); 
	} 

	int [] SumOfRemain ( int [] input) {
		int [] Output = new int[input.length]; 
		for (int i = 0; i < input.length; i++) { 
			int sum = 0; 
			for(int j =0 ;j< input.length;j++) { 
				if(i != j) { 
					sum += input[j]; 
				} 
			} 
			Output[i] = sum ; 
		} 
		return Output; 
	}
}

/*
OUTPUT
[14, 13, 12, 11, 10]
*/
