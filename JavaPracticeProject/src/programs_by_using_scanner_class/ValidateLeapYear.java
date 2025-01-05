/*
A leap year is a year that has 366 days instead of the usual 365 days. 
This extra day is added to the month of February, making it 29 days long instead of 28.
Definition of a Leap Year
A year is a leap year if:
1. It is divisible by 4 AND,
2. It is NOT divisible by 100, unless it is also divisible by 400.
Leap Year Examples : 2000 1900 2024
NOT Leap Year : 2023
*/
package programs_by_using_scanner_class;
import java.util.Scanner;
public class ValidateLeapYear {

	public static void main(String[] args) {
		/*condition= 
				1)century proper  divide by 400  OR
                2) proper divide by 4
                3) but not divisible by 100*/

		Scanner input =new Scanner(System.in);
		System.out.print("Enter Year=");
		int year= input.nextInt();

		if(year% 4==0){
			if(year%100==0){
				if(year%400==0){
					System.out.println( year + " is a leap year");
				}
				else {
					System.out.println( year + " is not leap year");
				}
			}
			else {
				System.out.println( year + " is a leap year");
			}
		}
		else {
			System.out.println( year + " is not leap year");
		}
		input.close();
	}
}

/*
OUTPUT
Enter Year=2023
2023 is not leap year
*/