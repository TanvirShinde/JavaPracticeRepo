package programs_on_arrays;

public class OddEvenElementFrequency {

	public static void main(String[] args) {
		int a[]= {1,2,5,6,8,9};
		int even=0;
		int odd=0;
		
		for(int i=0; i<a.length; i++)	{
			if(a[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Frequency of even no : " +even);
		System.out.println("Frequency of odd no  : "+odd);
	}
}

/*

OUTPUT
Frequency of even no : 3
Frequency of odd no  : 3

*/