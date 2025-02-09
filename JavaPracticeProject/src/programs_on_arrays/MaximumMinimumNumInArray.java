/*
Assignment - 51 : 16th Dec'2024 [15 mins]

print maximum and minimum number from given array.

input : {44,45,22,25,47,29,46}
output : 22

input : {-44,-45,-22,-25,-47,29,46}
output : -47
*/

package programs_on_arrays;

public class MaximumMinimumNumInArray {

	void findMinimumAndMiximumNumber(int[] arr) {
		int minNum = arr[0];
		int maxNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum)
				maxNum = arr[index];

			if (arr[index] < minNum)
				minNum = arr[index];
		}
		System.out.println("Maximum number in given array is --> " + maxNum);
		System.out.println("Minimum number in given array is --> " + minNum);
	}

	public static void main(String[] args) {
		int[] arr = { 44, 45, 22, 25, 47, 29, 46 };
		int[] arr1 = { -44, -45, -12, -25, -47, -29, -50 };

		MaximumMinimumNumInArray a51 = new MaximumMinimumNumInArray();
		a51.findMinimumAndMiximumNumber(arr);
		System.out.println("---------------------------------------");
		a51.findMinimumAndMiximumNumber(arr1);
	}
}

/*

OUTPUT
Maximum number in given array is --> 47
Minimum number in given array is --> 22
---------------------------------------
Maximum number in given array is --> -12
Minimum number in given array is --> -50

*/