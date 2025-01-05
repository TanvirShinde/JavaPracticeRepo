/*
A factorial of a number is the product of all positive integers from 1 up to that number. 
It is denoted by the symbol 𝑛! where n is a non-negative integer.
5!=5×4×3×2×1=120
*/
package programs_by_using_scanner_class;
import java.util.Scanner;
public class Factorial2Way {

	void checkfactorial ( int number) {
		int fact = 1;
		for ( int i=1 ; i<=number ; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of given number is :" + fact);
	}

	public static void main(String[] args) {
		Scanner jk = new Scanner (System.in);
		System.out.println("Enter your number?");
		int number = jk.nextInt();
		Factorial2Way test = new Factorial2Way();
		test.checkfactorial(number);
		jk.close();
	}
}

/*
OUTPUT
Enter your number?
5
Factorial of given number is :120
*/
