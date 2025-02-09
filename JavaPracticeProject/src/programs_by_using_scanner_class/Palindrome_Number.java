/*
A palindrome number is a number that reads the same forward and backward. 
In other words, if you reverse the digits of the number, the number remains unchanged.
Palindrome Numbers are 121, 12321 etc
123 → Reverse is 321 so it is not a palindrome.
*/

package programs_by_using_scanner_class;
import java.util.Scanner;
public class Palindrome_Number {

	void checkPalindromeNumber(int number) {
		int remain=0;
		while (number > 0) {
			remain = remain*10+ number%10;
			number = number/10;			
		}
		System.out.println("your palindrome number is : "+remain);
	}

	public static void main(String[] args) {
		Scanner test =new Scanner (System.in) ;
		System.out.println("Enter your palindrome number?");
		int number = test.nextInt();
		Palindrome_Number check = new Palindrome_Number ();
		check.checkPalindromeNumber(number);
		test.close();
	}
}

/*
OUTPUT
Enter your palindrome number?
121
your palindrome number is : 121
*/