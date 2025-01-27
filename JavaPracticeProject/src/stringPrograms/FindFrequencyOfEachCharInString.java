package stringPrograms;
public class FindFrequencyOfEachCharInString {
	
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
		FindFrequencyOfEachCharInString a32 = new FindFrequencyOfEachCharInString();
		a32.findFrequency("aakanksha");
	}
}

/*
OUTPUT
Frequency of char a --> 4
Frequency of char k --> 2
Frequency of char n --> 1
Frequency of char s --> 1
Frequency of char h --> 1
*/