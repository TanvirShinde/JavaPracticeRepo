package rohan;
public class SecMax {

	public static void main(String[] args) {
		String[] input = {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"};	
		SecMax se = new SecMax();
		se.Second(input);
	}
	
	void Second(String[] input) {
		String max = input[0];
		String secondMax = input[1];
		if(max.length() < input[1].length()) {
			secondMax = max;
			max = input[1];
		}	
		
		for(int i=2;i<input.length;i++) {
			if(max.length()<input[i].length()) {
				secondMax = max;
				max = input[i];
			}
			else if(secondMax.length() < input[i].length()) {
				secondMax = input[i];
			}
		}
		print(input, secondMax.length());
	}
	
	void print(String[] str , int length) {
		for(int i=0;i<str.length;i++) {
			if(str[i].length() == length) {
				System.out.println(str[i]);
			}
		}
	}
}
/*
OUTPUT
GlobantPune
PuneGlobant
PuGlobantne
*/
