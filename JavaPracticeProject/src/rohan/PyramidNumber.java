package rohan;

public class PyramidNumber {

	public static void main(String[] args) {
		int count =1;
		for (int i=1 ; i<=4; i++) {
			for (int k=4 ; k>=i; k--) {
				System.out.print(" ");
			}

			for (int j=1 ; i>=j; j++) {
				System.out.print((count)+ " ");
				count++;	
			}
			System.out.println();
		}
	}
}

/*
OUTPUT
    1 
   2 3 
  4 5 6 
 7 8 9 10 

*/