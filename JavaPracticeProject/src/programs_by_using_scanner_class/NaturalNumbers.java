/*
A natural number is a positive integer used for counting and ordering. 
Nantural Numbers are as :0,1,2,3,4,5
*/
package programs_by_using_scanner_class;
import java.util.Scanner;
public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner jk = new Scanner (System.in);
		System.out.println("Enter your number?");
		int number = jk.nextInt();
		System.out.print("Natural numbers are : ");
		for (int b=1; b<=number; b++) {
			System.out.print(" "+b);
		}
	}
}

/*
OUTPUT
Enter your number?
10
Natural numbers are :  1 2 3 4 5 6 7 8 9 10
*/