package programs_on_arrays;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int a[]= {10, 25, 3, 1,11,2,3,32};

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++)	{
				if(a[i]==a[j]){
					System.out.println("Duplicates of Array is : " +a[j]);
				}
			}
		}
	}
}
