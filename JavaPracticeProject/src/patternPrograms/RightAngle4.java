package patternPrograms;
public class RightAngle4 {

	void rightAngle4() {
		for (int a=1;a<=5;a++) {
			for(int b=5; b>=a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		RightAngle4 pattern = new RightAngle4();
		pattern.rightAngle4();
	}
}

/*
OUTPUT
*****
****
***
**
*
*/