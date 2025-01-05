/*
An Armstrong number is a number that is equal to the sum of its own digits 
each raised to the power of the number of digits.
1^3 + 5^3 + 3^3 =1+125+27=153 Hence,153 is an Armstrong number.
1^4+ 6^4 + 3^4 + 4^4 =1+1296+81+256=1634 Hence,1634 is an Armstrong number.
*/
package programs_by_using_scanner_class;
import java.util.Scanner;
public class AromstrongNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number ");
		int number= input.nextInt();

		int rev =0 ;
		int rem ;
		int arms = number ;

		while (number > 0) {
			rem = number % 10 ;
			rev = rev + rem *rem * rem * rem;
			number = number / 10 ;
		}

		System.out.println(rev);
		if (rev ==arms) {
			System.out.println(rev + " is a armstrong number");
		}
		else {
			System.out.println(rev+ " is not a armstrong number");
		}
	}
}

/*
OUTPUT
Enter your number 
1634
1634
1634 is a armstrong number
*/
