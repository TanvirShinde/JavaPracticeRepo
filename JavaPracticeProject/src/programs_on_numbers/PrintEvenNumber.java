package programs_on_numbers;
public class PrintEvenNumber {

	static void printEvenNumbers(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if(num % 2 == 0)
				System.out.println(num + " is Even Number.");
		}
	}

	public static void main(String[] args) {
		printEvenNumbers(10,15);
	}
}

/*

OUTPUT
10 is Even Number.
12 is Even Number.
14 is Even Number.

*/
