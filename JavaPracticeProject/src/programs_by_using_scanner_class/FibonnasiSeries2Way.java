/*
A Fibonacci Series is a sequence of numbers where each number is the sum of the two preceding ones.
The sequence starts with 0 and 1.
sequence looks like:0,1,1,2,3,5,8,13,21,34,55,
Explanation : 0+1 =1 , 1+1 =2 , 1=2=3 ,2+3=5 and so on 
*/

package programs_by_using_scanner_class;
import java.util.Scanner;
public class FibonnasiSeries2Way {
	
	void getFibonnasiSeries(int number) {
		int a=0;
		int b=1;
		int c;
		int i=0;
		System.out.print("FibonnasiSeries is as  :");
		while(i<=number) {
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.print(" " +c);		
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number ");
		int number= input.nextInt();
		FibonnasiSeries2Way getFibonnasiSeries = new FibonnasiSeries2Way();
		getFibonnasiSeries.getFibonnasiSeries(number);
		input.close();
	}	
}

/*
OUTPUT
Enter your number 
5
FibonnasiSeries is as  : 1 2 3 5 8 13
*/