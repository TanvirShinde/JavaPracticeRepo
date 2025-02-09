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
public class PrimeNumberBetweenRange2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your start range for Prime Numbers:");
		int startRange = input.nextInt();
		System.out.println("Enter your end range for Prime Numbers:");
		int endRange = input.nextInt();
		for (int i = startRange; i <= endRange; i++) {
			if (isPrime(i)) {
				System.out.print(" " + i);
			}
		}
		input.close();
	}

	public static boolean isPrime(int num) {
		if (num < 2) { 
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) { 
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

/*
OUTPUT
Enter your start range for Prime Numbers:
10
Enter your end range for Prime Numbers:
50
 11 13 17 19 23 29 31 37 41 43 47
*/