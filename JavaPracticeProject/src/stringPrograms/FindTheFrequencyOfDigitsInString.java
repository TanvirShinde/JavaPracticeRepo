package stringPrograms;
public class FindTheFrequencyOfDigitsInString {

	int returnUpperDigitFrequency(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void printFrequency(String str) {
		int frequencyCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (str.indexOf(ch) == index) {
					frequencyCount = returnUpperDigitFrequency(str, ch);
					System.out.println("Frequency of Digit " + ch + " is --> " + frequencyCount);
				}
			}
		}
	}

	public static void main(String[] args) {
		FindTheFrequencyOfDigitsInString a34 = new FindTheFrequencyOfDigitsInString();
		a34.printFrequency("AAB2cBB2BAd2ed3dd");
	}
}
/*

OUTPUT
Frequency of Digit 2 is --> 3
Frequency of Digit 3 is --> 1

*/