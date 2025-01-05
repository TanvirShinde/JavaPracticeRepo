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
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number ");
		int number= input.nextInt();
		int c=0;

		for (int i=2 ; i<=number ;i++) {
			if(number%i==0) {
				c++;
			}
		}
		if(c==1) {
			System.out.println(number + " : is a prime number");
		}
		else {
			System.out.println(number + " : is not a prime number");
		}
		input.close();
	}
}
/*
OUTPUT
Enter your number 
9
9 : is not a prime number
*/
