package stringPrograms;
public class FindTotalNumberOfDigitInString {

	static int digitCount = 0;

	int findDigitInString(String str){
		for(int index = 0; index < str.length(); index++){
			if(Character.isDigit(str.charAt(index)))
				FindTotalNumberOfDigitInString.digitCount++;
			}
		return digitCount;
	}	

	public static void main(String[] args) {
		String str = "Tanvir27Shinde0027";
		FindTotalNumberOfDigitInString value = new FindTotalNumberOfDigitInString();
		int count = value.findDigitInString(str);
		System.out.println("Total digit count in given String is " + count);
	}
}

/*

OUTPUT
Total digit count in given String is 6

*/