package programs_on_arrays;
public class FindMiddleCharacterOfStringInArray {

	static char returnMiddleChar(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			if (str.length() % 2 == 0) {
				int num = (str.length() / 2) - 1;	
				ch = str.charAt(num);
				break;
			} else {
				int num = str.length() / 2;
				ch = str.charAt(num);
				break;
			}
		}
		return ch;
	}

	void getArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			char ch = returnMiddleChar(arr[index]);
			System.out.println("Middle Character of string " + arr[index] + " is --> " + ch);
		}
	}

	public static void main(String[] args) {
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };

		FindMiddleCharacterOfStringInArray a46 = new FindMiddleCharacterOfStringInArray();
		a46.getArray(names);
	}
}

/*

OUTPUT
Middle Character of string Rohan is --> h
Middle Character of string Premlata is --> m
Middle Character of string Anuja is --> u
Middle Character of string Fazrana is --> r

*/