package asciiValue;
public class GetAsciiValueOfChar {

	void asciivalue(char ch) {
		int asciiValue=(int) ch;
		System.out.println("Ascii value for Given characters are =" +asciiValue);
	}

	public static void main(String[] args) {
		GetAsciiValueOfChar value=new GetAsciiValueOfChar();
		value.asciivalue('A');
		value.asciivalue('x');
		value.asciivalue(' ');
		value.asciivalue('.');
	}
}

/*
OUTPUT
Ascii value for Given characters are =65
Ascii value for Given characters are =120
Ascii value for Given characters are =32
Ascii value for Given characters are =46
*/