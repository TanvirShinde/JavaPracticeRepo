package stringPrograms;
public class FindTheFrequencyOfUpperCharInString {

	int returnUpperCharFrequency(String str, char ch) {
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
			if (Character.isUpperCase(ch)) {
				if (str.indexOf(ch) == index) {
					frequencyCount = returnUpperCharFrequency(str, ch);
					System.out.println("Frequency of char " + ch + " is --> " + frequencyCount);
				}
			}
		}
	}

	public static void main(String[] args) {
		FindTheFrequencyOfUpperCharInString a33 = new FindTheFrequencyOfUpperCharInString();
		a33.printFrequency("AABcBBBAdeddd");
	}
}
/*

OUTPUT
Frequency of char A is --> 3
Frequency of char B is --> 4

*/