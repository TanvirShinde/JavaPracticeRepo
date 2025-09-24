package rohan;

import java.util.Arrays;

public class ADemoProgram2 {

	public static void main(String[] args) {
		
		String[] input = {"tech", "aashvi", "credits"};
        String[] output = new String[input.length];
        
        for (int i=0 ; i<input.length; i++) {
        	
        	String word ="";
        	
        	String str = input[input.length-1-i];
        	
        	for( int j=str.length()-1 ;j>=0 ; j--) {
        		
        		word+=str.charAt(j);
        	}
        	
        	System.out.println(word);
        	
        	output[i]=word;
        }

        System.out.println(Arrays.toString(output));
	}
}
