package basicPrograms;
public class SumOfNumDivBy3and5 {
	static int sum = 0;
	static int count = 0;

	void printNumberDivisibleBy5and3(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num + " is Divisible By 3 & 5");
				count++;
				sumOfNum(num);
			}
		}
	}

	void sumOfNum(int num) {
		sum += num;
	}

	public static void main(String[] args) {
		SumOfNumDivBy3and5 a14 = new SumOfNumDivBy3and5();
		int num1 = 1;
		int num2 = 70;
		a14.printNumberDivisibleBy5and3(num1, num2);
		System.out.println("In the range " + num1 + " to " + num2 + " , calculated sum is " + sum);
		System.out
				.println("In the range " + num1 + " to " + num2 + " , " + count + " numbers are divisible by 3 and 5.");
	}
}
/*
OUTPUT
15 is Divisible By 3 & 5
30 is Divisible By 3 & 5
45 is Divisible By 3 & 5
60 is Divisible By 3 & 5
In the range 1 to 70 , calculated sum is 150
In the range 1 to 70 , 4 numbers are divisible by 3 and 5.
*/
