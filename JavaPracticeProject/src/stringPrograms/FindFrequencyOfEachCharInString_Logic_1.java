package stringPrograms;
public class FindFrequencyOfEachCharInString_Logic_1 {

	int returnCountOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void findFrequency(String input) {
		int frequencyOfChar = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				frequencyOfChar = returnCountOfChar(input, ch);
				System.out.println("Frequency of char " + ch + " --> " + frequencyOfChar);
			}
		}
	}

	public static void main(String[] args) {
		FindFrequencyOfEachCharInString_Logic_1 a32 = new FindFrequencyOfEachCharInString_Logic_1();
		a32.findFrequency("technocredits");
	}
}
/*
OUTPUT
Frequency of char t --> 2
Frequency of char e --> 2
Frequency of char c --> 2
Frequency of char h --> 1
Frequency of char n --> 1
Frequency of char o --> 1
Frequency of char r --> 1
Frequency of char d --> 1
Frequency of char i --> 1
Frequency of char s --> 1
*/