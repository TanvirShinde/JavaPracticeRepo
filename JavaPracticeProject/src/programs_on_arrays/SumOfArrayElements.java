package programs_on_arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int a[] = {10,15,7,20,55,87,18,47};

		int sum=0;

		for(int i=0; i<a.length; i++) {
			sum= sum + a[i];
		}

		System.out.println("Sum of all Array Elements is : " +sum);
	}
}

/*

OUTPUT
Sum of all Array Elements is : 259

*/