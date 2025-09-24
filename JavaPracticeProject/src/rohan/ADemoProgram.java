package rohan;

import java.util.Arrays;

public class ADemoProgram {

	
	public static void main(String[] args) {
		
		String[] input = { "tech", "aashvi", "credits" }; 
		
		String [] output = new String [input.length];
		
		for( int i=0 ; i<input.length ; i++) {
			String rev = "";
			String str = input[i];
			for (int j=str.length()-1 ; j>=0 ; j--) {
				rev+=str.charAt(j);
			}
			
			System.out.println(rev);
			
			output[i]=rev;
		}
		
		System.out.println(Arrays.toString(output));
	}
	
}
