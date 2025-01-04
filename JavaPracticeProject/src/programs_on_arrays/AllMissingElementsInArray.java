package programs_on_arrays;

public class AllMissingElementsInArray {

	public static void main(String[] args) {

		boolean status=true; 

		int a[]= {22,17,4,36,8,2,45}; 

		for(int j=1;j<=46;j++) { 
			for(int i=0;i<a.length;i++) { 
				if(j==a[i]) { 
					status=false; 
					break; 
				} 
			} 
			if(status==true)//number is not present 
			{ 
				System.out.print(" " +j); 
			} 
			status=true;//for every number status should be true 
		} 
	}
}

/*

OUTPUT
 1 3 5 6 7 9 10 11 12 13 14 15 16 18 19 20 21 23 24 25 26 27 28 29 30 31 32 33 34 35 37 38 39 40 41 42 43 44 46

*/