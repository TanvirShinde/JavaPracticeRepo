package patternPrograms;
public class RightAngleWithChar {

	void patternPrinting() {
		char count='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count +" ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		RightAngleWithChar pattern=new RightAngleWithChar();
		pattern.patternPrinting();
	}
}

/*
OUTPUT
A 
B C 
D E F 
G H I J 
*/