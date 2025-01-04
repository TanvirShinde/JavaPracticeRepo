package programs_on_arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int [] jk = new int [5] ;
		jk [0]=3;
		jk [1]=8;
		jk [2]=5;
		jk [3]=11;
		jk [4]=15;

		System.out.println("**********Before Sorting of array********");
		int size = jk.length;
		System.out.println(size);
		for (int bb:jk) {

			System.out.println(bb);
		}

		System.out.println("**********AfterSortingOfArray************");
		Arrays.sort(jk);

		for (int cx:jk) {
			System.out.println(cx);
		}
	}
}

/*

OUTPUT
**********Before Sorting of array********
5
3
8
5
11
15
**********AfterSortingOfArray************
3
5
8
11
15

*/