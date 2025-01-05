package asciiValue;
public class PrintAsciiValueOfCharGivenRange {

	void printChar(int startRange, int endRange) {
		for(int i=startRange;i<=endRange;i++) {
			char ch=(char) i;
			System.out.println("Character at " +i +" is= " +ch);
		}
	}

	public static void main(String[] args) {
		PrintAsciiValueOfCharGivenRange assignment28=new PrintAsciiValueOfCharGivenRange();
		assignment28.printChar(65, 100);
	}
}

/*
OUTPUT
Character at 65 is= A
Character at 66 is= B
Character at 67 is= C
Character at 68 is= D
Character at 69 is= E
Character at 70 is= F
Character at 71 is= G
Character at 72 is= H
Character at 73 is= I
Character at 74 is= J
Character at 75 is= K
Character at 76 is= L
Character at 77 is= M
Character at 78 is= N
Character at 79 is= O
Character at 80 is= P
Character at 81 is= Q
Character at 82 is= R
Character at 83 is= S
Character at 84 is= T
Character at 85 is= U
Character at 86 is= V
Character at 87 is= W
Character at 88 is= X
Character at 89 is= Y
Character at 90 is= Z
Character at 91 is= [
Character at 92 is= \
Character at 93 is= ]
Character at 94 is= ^
Character at 95 is= _
Character at 96 is= `
Character at 97 is= a
Character at 98 is= b
Character at 99 is= c
Character at 100 is= d
*/