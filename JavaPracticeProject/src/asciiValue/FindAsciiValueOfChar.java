package asciiValue;
public class FindAsciiValueOfChar {

	void findcharfromAscii(int input) {
		char ch=(char) input;
		System.out.println("Character for Given Ascii Values are = "+ch);	
	}

	public static void main(String[] args) {
		FindAsciiValueOfChar value=new FindAsciiValueOfChar();
		value.findcharfromAscii(65);
		value.findcharfromAscii(90);
		value.findcharfromAscii(55);
	}
}

/*
OUTPUT
Character for Given Ascii Values are = A
Character for Given Ascii Values are = Z
Character for Given Ascii Values are = 7
*/