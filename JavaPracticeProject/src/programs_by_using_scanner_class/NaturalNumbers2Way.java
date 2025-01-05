/*
A natural number is a positive integer used for counting and ordering. 
Nantural Numbers are as :0,1,2,3,4,5
*/
package programs_by_using_scanner_class;
import java.util.Scanner;
public class NaturalNumbers2Way {

	void getNaturalNumber (int number) {
		for (int i=0 ; i<=number ; i++) {
			System.out.print(" " + i);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your number");
		int number =input.nextInt();
		NaturalNumbers2Way test = new NaturalNumbers2Way();
		System.out.println("Natural Numbers are as :");
		test.getNaturalNumber(number);
		input.close();
	}
}
/*
OUTPUT
Enter your number
10
Natural Numbers are as :
 0 1 2 3 4 5 6 7 8 9 10
*/
