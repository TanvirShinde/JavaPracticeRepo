/*
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
For example:
	2 is a prime number (divisible only by 1 and 2)
	3 is a prime number (divisible only by 1 and 3).
	4 is not a prime number (divisible by 1, 2, and 4).
	5 is a prime number (divisible only by 1 and 5)
	*/
package programs_by_using_scanner_class;
import java.util.Scanner;
public class PrimeNumberBetweenRange {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your startRange for Prime Number?");
		int startRange = input.nextInt();
		System.out.print("Prime numbers are :");
		int c=0;

		int number =100;
		for (int i=startRange ; i<=number ;i++) {
			for (int j=2 ; j<=i ; j++) {
				if(i%j==0) {
					c++;
				}
			}
			if (c==1) {
				System.out.print(" "+ i);
			}
			else {
				c=0;
			}
		}
		input.close();
	}
}

/*
OUTPUT
Enter your startRange for Prime Number?
50
Prime numbers are : 53 59 61 67 71 73 79 83 89 97
*/
