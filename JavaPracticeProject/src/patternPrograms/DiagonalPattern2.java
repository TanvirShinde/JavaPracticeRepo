package patternPrograms;
public class DiagonalPattern2 {
	
	void digonalPattern2 () {
		for (int a=1; a<=5; a++) {
			for (int b=1; a>=b; b++) {
				if (a>=2 && b<=(a-1)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		DiagonalPattern2 pattern = new DiagonalPattern2();
		pattern.digonalPattern2();
	}
}

/*
OUTPUT
*
 *
  *
   *
    *
*/
