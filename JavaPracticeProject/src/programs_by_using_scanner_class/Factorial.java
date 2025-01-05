/*
A factorial of a number is the product of all positive integers from 1 up to that number. 
It is denoted by the symbol 𝑛! where n is a non-negative integer.
5!=5×4×3×2×1=120
*/

package programs_by_using_scanner_class;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		Scanner jk = new Scanner (System.in);
		System.out.println("Enter your number?");
		int number = jk.nextInt();

		int i;
		int fact=1;

		for ( i=1; i<=number ;i++) {
			fact = fact*i;
		}

		System.out.println("Your value is:"+fact);
		jk.close();
	}
}

/*
OUTPUT
Enter your number?
5
Your value is:120
*/
