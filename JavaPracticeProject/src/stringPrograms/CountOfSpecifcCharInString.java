package stringPrograms;

public class CountOfSpecifcCharInString {

	public static void main(String[] args) { 
		
		String s="javaEEdeve"; 
		int count=0; 
		
		for(int i=0;i<s.length();i++) { 
			if(s.charAt(i)=='e'||s.charAt(i)=='E') { 
				count++; 
			} 
		} 
		System.out.println("Count of E/e is : "+count); 
	}
}

/*
OUTPUT
Count of E/e is : 4
*/