package stringPrograms;
public class LargestWordOfGivenString {

	public static void main(String[] args) { 

		String s="I am a java developer"; 

		String s1[]=s.split(" "); 

		System.out.println("length of array : "+s1.length); 

		for(int i=0;i<s1.length;i++) 	{ 
			System.out.print(s1[i]+"-"); 

			System.out.println(s1[i].length()); 
		} 
		int max=0; 
		for(int i=0;i<s1.length;i++) { 
			if(s1[i].length()>max) 
			{ 
				max=s1[i].length(); 
			} 	
		} 

		System.out.print("The longest word from the string : "+max); 
	}
}

/*
OUTPUT
length of array : 5
I-1
am-2
a-1
java-4
developer-9
The longest word from the string : 9
*/