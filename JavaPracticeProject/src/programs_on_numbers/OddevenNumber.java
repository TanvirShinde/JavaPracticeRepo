package programs_on_numbers;

public class OddevenNumber {

	public static void main(String[] args) {

		for (int a=1; a<=10; a++)  {

			if (a%2==0) {
				System.out.println("This is even number "+ a);
			}
			else {
				System.out.println("This is odd number :"+ a);
			}
		}
	}
}

/*

OUTPUT
This is odd number :1
This is even number 2
This is odd number :3
This is even number 4
This is odd number :5
This is even number 6
This is odd number :7
This is even number 8
This is odd number :9
This is even number 10

*/