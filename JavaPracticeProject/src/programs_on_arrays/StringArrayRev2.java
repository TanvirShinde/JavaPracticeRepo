package programs_on_arrays;

import java.util.Arrays;

public class StringArrayRev2 { 
	public static void main(String[] args) { 
		StringArrayRev2 rev = new StringArrayRev2(); 
		String[] input = { "tech", "aashvi", "credits" }; 
		String[] str = rev.ReverOrderString(input); 
		System.out.println(Arrays.toString(str));
	} 
	
	String Reverse(String str) {
		String word = " "; 
		for (int i = str.length()-1; i>=0; i--) { 
			word += str.charAt(i); 
		} 
		return word;
	} 
	
	String[] ReverOrderString(String[] input) {
		String[] output = new String[input.length]; 
		for(int i=input.length-1;i>=0;i--) { 
			output[i] = Reverse(input[input.length-1-i]);
		} 
		return output;
	} 	
}

/*
OUTPUT
[ stiderc,  ivhsaa,  hcet]
*/