package asciiValue;
public class PrintAscii {

	void getAscii(char startChar, char endChar) {
		for (char ch = startChar; ch <= endChar; ch++) {
			int asciiValue = ch;
			System.out.println("Ascii value of " + ch + " is --->  " + asciiValue);
		}
	}

	public static void main(String[] args) {
		PrintAscii a29 = new PrintAscii();
		a29.getAscii('A', 'Z');
		a29.getAscii('a', 'z');
		a29.getAscii('0', '9');
	}
}