package programs_on_numbers;

public class AromstrongNumber {

	public static void main(String[] args) {
		int number = 1634 ;
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
1634
1634 is a armstrong number

*/
