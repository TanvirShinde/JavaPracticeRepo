package programs_on_arrays;

public class FrequencyOfSpecificNumberInArray {

	public static void main(String[] args) {

		int a[]= {10,15,12,17,12,12,18,12};

		int num=12;
		int count=0;

		for(int i=0; i<a.length; i++){
			if(a[i]==num){
				count++;
			}
		}
		System.out.println("Frequency of " +num + " in array is : "	+count);
	}
}

/*

OUTPUT
Frequency of 12 in array is : 4

*/