package rohan;

import java.util.Arrays;

public class ReverseArrayOrderWithReverseString3 {

	public static void main(String[] args) {
		ReverseArrayOrderWithReverseString3 programme = new ReverseArrayOrderWithReverseString3();
		String[] input = { "TeCh", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		String[] Output = programme.StringOrderArray(input);
		System.out.println(Arrays.toString(Output));
	}

	String StringRev(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			word += str.charAt(i);
		}
		return word;
	}

	String OnlyAlphabat(String str) {
		String Out = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				Out += str.charAt(i);
			}
		}
		return Out;
	}

	String ContainNumber(String s) {
		String Output = "";
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!Character.isDigit(ch)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			Output = StringRev(s);
		} else if (flag == false) {
			Output = OnlyAlphabat(s);
		}

		return Output;
	}

	String[] StringOrderArray(String[] input) {
		String[] Output = new String[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			Output[i] = ContainNumber(input[input.length - 1 - i]);
		}
		return Output;
	}
}
/*
OUTPUT
[HSNA, CrEdits, AasHvi, hCeT]
*/