package stringPrograms;

public class SumOfEvenDigitsOfGivenString {

	void sumOfEvenNo(String str) {
		int sum=0;
		int count=0;
		for(int i=0;i<str.length();i++) {

			char ch=str.charAt(i);
			boolean flag =Character.isDigit(ch);
			if(flag) {
				count++;
				int digit=Character.getNumericValue(ch);
				if(digit%2==0) {
					sum=sum+digit;
					System.out.println("Sum of Even Numbers in given string is =" +sum);
				}
			}

		}
	}

	public static void main(String[] args) {
		SumOfEvenDigitsOfGivenString assignment30=new SumOfEvenDigitsOfGivenString();
		assignment30.sumOfEvenNo("te1ch2no3cre7dits");
		assignment30.sumOfEvenNo("Tanvir Shinde");
		assignment30.sumOfEvenNo("45632");


	}

}

/*
OUTPUT
Sum of Even Numbers in given string is =2
Sum of Even Numbers in given string is =4
Sum of Even Numbers in given string is =10
Sum of Even Numbers in given string is =12
*/
