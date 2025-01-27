package rohan;
public class CharCountOfGivenString {

	public static void main(String[] args) {
		CharCountOfGivenString assignment = new CharCountOfGivenString();
		int a = assignment.Num("aakansha",'a');
		System.out.println(a);
	}

	int Num(String str, char ch){
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
/*
OUTPUT
4
*/