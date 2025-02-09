package stringPrograms;
public class FindFrequencyOfEachCharInString_Logic_2 {
	
	void findFrequency(String str) {
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				int frequencyOfChar = 0;
				for (int innerIndex = 0; innerIndex <= str.length() - 1; innerIndex++) {
					if (str.charAt(innerIndex) == ch)
						frequencyOfChar++;
				}
				System.out.println("Frequency of char " + ch + " --> " + frequencyOfChar);
			}
		}
	}

	public static void main(String[] args) {
		FindFrequencyOfEachCharInString_Logic_2 a32 = new FindFrequencyOfEachCharInString_Logic_2();
		a32.findFrequency("reference");
	}
}
/*
OUTPUT
Frequency of char r --> 2
Frequency of char e --> 4
Frequency of char f --> 1
Frequency of char n --> 1
Frequency of char c --> 1
*/