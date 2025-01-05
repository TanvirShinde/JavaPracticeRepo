package asciiValue;
public class ReturnAsciiValueOfChar {

	static int returnAsciiValue(char ch) {
		int value = ch;
		return value;
	}

	static void printAsciiValue(char ch) {
		int asciiValue = returnAsciiValue(ch);
		System.out.println("Input char is - " + ch + " And it's ASCII value is - " + asciiValue);
	}

	public static void main(String[] args) {
		printAsciiValue('A');
		printAsciiValue('x');
		printAsciiValue(' ');
		printAsciiValue('.');
	}
}

/*
OUTPUT
Input char is - A And it's ASCII value is - 65
Input char is - x And it's ASCII value is - 120
Input char is -   And it's ASCII value is - 32
Input char is - . And it's ASCII value is - 46
*/