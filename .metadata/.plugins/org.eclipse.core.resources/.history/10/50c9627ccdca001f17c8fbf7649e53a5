package stringPrograms;
public class FrequencyOfUpperCaseLetters {
	void getFreqChar(String input) {
		System.out.print("Frequency of UpperCase Characters in given String " + "AABcBBBAdeddd" + " is = ");
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			int count = 0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == currentChar) {
					count++;
				}
			}
			if (input.indexOf(currentChar) == i && Character.isUpperCase(currentChar)) {
				System.out.println(currentChar + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		FrequencyOfUpperCaseLetters assignment33 = new FrequencyOfUpperCaseLetters();
		assignment33.getFreqChar("AABcBBBAdeddd");
	}
}