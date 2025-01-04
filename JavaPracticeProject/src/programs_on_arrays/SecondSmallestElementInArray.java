package programs_on_arrays;

public class SecondSmallestElementInArray {

	public static void main(String[] args) { 

		int a[]= {22,5,6,88,9}; 

		int min=a[0],secmin=a[0]; 

		for(int i=1;i<a.length;i++) { 

			if(a[i]<min) { 
				secmin=min; 
				min=a[i]; 
			} 

			else if(a[i]<secmin) { 
				secmin=a[i]; 
			} 
		} 

		System.out.println("minimum value : "+min); 
		System.out.println("second minimum value : "+secmin); 
	}
}

/*

OUTPUT
minimum value : 5
second minimum value : 6

*/