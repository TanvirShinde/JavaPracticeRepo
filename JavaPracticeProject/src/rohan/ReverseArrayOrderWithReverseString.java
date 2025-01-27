package rohan;

import java.util.Arrays;

public class ReverseArrayOrderWithReverseString {

	public static void main(String[] args) {
		ReverseArrayOrderWithReverseString assignment = new ReverseArrayOrderWithReverseString();
		String[] input = {"Tanvir", "Rupesh", "Credits", "Ansh"};
		
		String[] str = assignment.StringRevOrder(input);
		System.out.println(Arrays.toString(str));
	}
	
	String StringRev(String str) {
		String word = "";
		for(int i=str.length()-1;i>=0;i--) {
			word += str.charAt(i);
			word = word.toLowerCase();
		}
		String output = word.substring(0,1).toUpperCase() + word.substring(1);
		return output;
	}
	
	String[] StringRevOrder(String[] input) {
		String[] Output = new String[input.length];
		for(int i=input.length-1;i>=0;i--) {
			Output[i] = StringRev(input[input.length-1-i]);
		}
		return Output;
	}	
}

/*
OUTPUT
[Hsna, Stiderc, Hsepur, Rivnat]
*/