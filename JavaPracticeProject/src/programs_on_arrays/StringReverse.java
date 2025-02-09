package programs_on_arrays;

import java.util.Arrays;

public class StringReverse { 
	public static void main(String[] args) { 
		StringReverse rev = new StringReverse(); 
		String[] input = { "tech", "aashvi", "credits" }; 
		String[] output = rev.Reverse(input); 
		System.out.println(Arrays.toString(output)); 
	}

	String[] Reverse(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) { 
			output[i] = revserString(input[i]); 
		}
		return output	;
	}

	String revserString(String str) { 
		String string = " "; 
		for (int i = str.length() - 1; i >= 0; i--) { 
			string += str.charAt(i);} 
		System.out.println(string); 
		return string;
	} 
}

/*
OUTPUT
 hcet
 ivhsaa
 stiderc
[ hcet,  ivhsaa,  stiderc]
*/