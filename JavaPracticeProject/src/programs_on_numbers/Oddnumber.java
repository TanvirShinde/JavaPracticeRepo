package programs_on_numbers;

public class Oddnumber {

	public static void main(String[] args) {

		int number = 10;

		System.out.print("Odd numbers are : ");

		for (int i=0 ; i<=number ; i++) {
			if (i%2==0)  {
				System.out.print(" " + i);
			}  
		}
	}	
}

/*

OUTPUT
Odd numbers are :  0 2 4 6 8 10

*/