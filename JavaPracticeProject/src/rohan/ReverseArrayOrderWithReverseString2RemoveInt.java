package rohan;

import java.util.Arrays;

public class ReverseArrayOrderWithReverseString2RemoveInt {
	public static void main(String[] args) {
		ReverseArrayOrderWithReverseString2RemoveInt assignment = new ReverseArrayOrderWithReverseString2RemoveInt();
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		String[] str = assignment.StringOrderArray(input);
		System.out.println(Arrays.toString(str));
	}

	String StringRev(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				word += str.charAt(i);
			}
		}
		return word;
	}

	String[] StringOrderArray(String[] input) {
		String[] Output = new String[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			Output[i] = StringRev(input[input.length - 1 - i]);
		}
		return Output;
	}
}