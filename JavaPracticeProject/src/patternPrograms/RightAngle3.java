package patternPrograms;
public class RightAngle3 {

	void rightAngle3 () {
		for (int a=1; a<=7;a++) {
			for (int b=1; a>=b; b++) {
				System.out.print(" ");
			}
			for (int c=7; c>=a; c--)	{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RightAngle3 pattern = new RightAngle3 ();
		pattern.rightAngle3();
	}
}

/*
OUTPUT
 *******
  ******
   *****
    ****
     ***
      **
       *
*/