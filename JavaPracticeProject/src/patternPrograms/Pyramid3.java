package patternPrograms;
public class Pyramid3 {

	void pyramid3 () {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i<=j){ 
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
	}

	public static void main(String args[ ]){
		Pyramid3 pattern = new Pyramid3 ();
		pattern.pyramid3();
	}
}

/*
OUTPUT
* * * * 
 * * * 
  * * 
   * 
*/
