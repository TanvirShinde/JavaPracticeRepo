package patternPrograms;
public class FullBlock {

	void square () {
		for (int a=1;a<=5;a++) {
			for (int b=1 ; b<=5; b++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}

	public static void main(String[] args) {
		FullBlock qa = new FullBlock();
		qa.square();
	}
}

/*
OUTPUT
*****
*****
*****
*****
*****
*/
