package programs_on_arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,7,8,9,10};
		int val=1;

		for(int i=0; i<a.length; i++) {
			if(a[i]!=val){
				break;
			}
			val++;
		}

		System.out.println("Missing Element in Array is : "+val);
	}
}

/*

OUTPUT
Missing Element in Array is : 6

*/