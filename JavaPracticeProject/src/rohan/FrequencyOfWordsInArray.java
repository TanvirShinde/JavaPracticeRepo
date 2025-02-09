package rohan;
/*
Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1
 */
public class FrequencyOfWordsInArray {

	public static void main(String[] args) {
		FrequencyOfWordsInArray assignment = new FrequencyOfWordsInArray();
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		assignment.Count(str);
	}
	void Count(String str) {
		String[] word =  str.split(" ");
		for(int i=0;i<word.length;i++) {
			int count = 0;
			for(int j=0 ;j< word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
				}
			}
			System.out.println(word[i]+"=>"+count);
		}
	}
}
/*
OUTPUT
Hi=>4
Hello=>1
Hi=>4
Hi=>4
Hi=>4
Techno=>2
Credits=>1
Techno=>2
*/