/*
A Fibonacci Series is a sequence of numbers where each number is the sum of the two preceding ones.
The sequence starts with 0 and 1.
sequence looks like:0,1,1,2,3,5,8,13,21,34,55,
Explanation : 0+1 =1 , 1+1 =2 , 1=2=3 ,2+3=5 and so on 
*/

package programs_by_using_scanner_class;
import java.util.Scanner;
public class FibonnasiSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number ");
		int number= input.nextInt();
		int a=0;
		int b=1;
		int c;
		int i=0;
		System.out.print("FibonnasiSeries is as  :");
		while (i<=number) {
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.print(" " +c);		
		}	
		input.close();
	}	
}

/*
OUTPUT
Enter your number 
10
FibonnasiSeries is as  : 1 2 3 5 8 13 21 34 55 89 144
*/
