/*
An Armstrong number is a number that is equal to the sum of its own digits 
each raised to the power of the number of digits.
1^3 + 5^3 + 3^3 =1+125+27=153 Hence,153 is an Armstrong number.
1^4+ 6^4 + 3^4 + 4^4 =1+1296+81+256=1634 Hence,1634 is an Armstrong number.
*/
package programs_by_using_scanner_class;
import java.util.Scanner;
public class ArmstrongNumber3Way {

	public boolean isArmstrong(int number) {
		int originalNumber = number ;
		int result =0 ;
		int rem ;

		while (number > 0) {
			rem = number % 10 ;
			result = result + rem *rem * rem * rem;
			number = number / 10 ;
		}

		return result == originalNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number to check if it's an Armstrong number:");
		int number = scanner.nextInt();

		ArmstrongNumber3Way armstrongNumberChecker = new ArmstrongNumber3Way();

		if (armstrongNumberChecker.isArmstrong(number)) {
			System.out.println(number + " is an Armstrong number.");
		} 
		else {
			System.out.println(number + " is not an Armstrong number.");
		}
		scanner.close();
	}
}

/*
OUTPUT
Enter a number to check if it's an Armstrong number:
370
370 is not an Armstrong number.
*/
