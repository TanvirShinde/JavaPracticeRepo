package asciiValue;

public class GetAsciiValueOfChar {
	
	void asciivalue(char ch) {
		
		int asciiValue=(int) ch;
		System.out.println("Ascii value for Given characters are =" +asciiValue);
	}

	public static void main(String[] args) {
		
		GetAsciiValueOfChar assignment26=new GetAsciiValueOfChar();
		assignment26.asciivalue('A');
		assignment26.asciivalue('x');
		assignment26.asciivalue(' ');
		assignment26.asciivalue('.');
		
	}

}
