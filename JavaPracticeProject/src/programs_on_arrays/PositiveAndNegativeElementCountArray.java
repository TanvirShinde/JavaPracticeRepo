package programs_on_arrays;

public class PositiveAndNegativeElementCountArray {

	public static void main(String[] args) {

		int a[]= {-10,-20,15,48,-15,47,78,-45};

		int positiveCount=0;
		int negativeCount=0;

		for(int i=0; i<a.length; i++){


			if(a[i]>0){
				positiveCount++;
			}
			else{
				negativeCount++;
			}
		}
		System.out.println("Positive count of Element is : " +positiveCount);
		System.out.println("Negative count of Element is  : " +negativeCount);
	}
}

/*

OUTPUT
Positive count of Element is : 4
Negative count of Element is  : 4

*/
