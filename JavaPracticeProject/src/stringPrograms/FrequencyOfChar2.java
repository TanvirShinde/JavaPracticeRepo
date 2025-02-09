package stringPrograms;
public class FrequencyOfChar2 {

	int getCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char currentCh = input.charAt(index);
			if (ch == currentCh)
				count++;
		}
		return count;
	}

	void printFreqOfAllDigitChar(String input) {
		System.out.println("Frequency of digits in given String " + "AAB2cBB2BAd2ed3dd" + " is =");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int charIndex = input.indexOf(ch);
			if (Character.isDigit(ch) && (charIndex == index)) {
				int count = getCharFreq(input, ch);
				System.out.println(ch + "->" + count);
			}
		}
	}

	public static void main(String[] args) {

		FrequencyOfChar2 assignment34 = new FrequencyOfChar2();
		String input = "AAB2cBB2BAd2ed3dd";
		assignment34.getCharFreq(input, 'A');
		assignment34.printFreqOfAllDigitChar(input);
	}

}

/*

OUTPUT
Frequency of digits in given String AAB2cBB2BAd2ed3dd is =
2->3
3->1

*/