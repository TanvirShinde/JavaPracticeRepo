package patternPrograms;
public class RightAngle2 {

	void rightAngle () {
		for(int a=1;a<=5; a++) {
			for (int b=4; b>=a;b--) {
				System.out.print(" ");
			}
			for (int c=1; a>=c; c++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		RightAngle2 pattern = new RightAngle2();
		pattern.rightAngle();
	}
}

/*
OUTPUT
    *
   **
  ***
 ****
*****
*/