package basicPrograms;
public class MaxMinNumber {
	
	void minOf2(int num1, int num2) {
		if(num1<num2) {
			System.out.println(+num1 +" is Smaller between " +num1 +" and " +num2);
		}else {
			System.out.println(+num2 +" is Smaller between " +num1 +" and " +num2);
		}
	}
	void maxOf2(int num1, int num2) {
		if(num1>num2) {
			System.out.println(+num1 +" is bigger between " +num1 +" and " +num2);
		}else {
			System.out.println(+num2 +" is bigger between " +num1 +" and " +num2);
		}
	}

	public static void main(String[] args) {
		MaxMinNumber maxmin=new MaxMinNumber();
		maxmin.minOf2(10,17);
		maxmin.maxOf2(10,17);
	}
}

/*
OUTPUT
10 is Smaller between 10 and 17
17 is bigger between 10 and 17
*/