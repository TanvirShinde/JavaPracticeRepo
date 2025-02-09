package stringPrograms;
public class FindTheUpperLowerFrequencyDifference {

	String printFrequencyDifference(String str) {
		int frequencyUpperCharCount = 0;
		int frequencyLowerCharCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				frequencyUpperCharCount++;
			} else if (Character.isLowerCase(ch)) {
				frequencyLowerCharCount++;
			} else {
				System.out.println("Invalid char");
			}
		}
		System.out.println("Frequency of UpperCase character is --> " + frequencyUpperCharCount);
		System.out.println("Frequency of LowerCase character is --> " + frequencyLowerCharCount);

		if (frequencyUpperCharCount > frequencyLowerCharCount)
			return "upper";
		else
			return "lower";
	}

	public static void main(String[] args) {
		FindTheUpperLowerFrequencyDifference a35 = new FindTheUpperLowerFrequencyDifference();
		String str = a35.printFrequencyDifference("teChnOcreDits");
		System.out.println(str + " case count is greater in given string.");
	}
}
/*
OUTPUT
Frequency of UpperCase character is --> 3
Frequency of LowerCase character is --> 10
lower case count is greater in given string.
*/