
package programs_on_arrays;

public class UnionOfArray {

	static int[] returnUnionOfArray(int[] arr1, int[] arr2) {
		int len = arr1.length + arr2.length;
		int[] output = new int[len];
		int count = 0;
		for (int index = 0; index < arr1.length; index++) {
			output[count] = arr1[index];
			count++;
		}

		for (int index = 0; index < arr2.length; index++) {
			output[count] = arr2[index];
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 19, 18 };
		int[] arr2 = { 99, 8 };
		int[] op = returnUnionOfArray(arr1, arr2);
		System.out.println("Unioin of Array --> ");
		for (int index = 0; index < op.length; index++) {
			System.out.print(op[index] + " ");
		}
	}
}

/*

OUTPUT
Unioin of Array --> 
10 19 18 99 8 

*/
