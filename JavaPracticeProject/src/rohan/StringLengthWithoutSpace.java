package rohan;
public class StringLengthWithoutSpace {

	public static void main(String[] args) {
		StringLengthWithoutSpace assignment = new StringLengthWithoutSpace();
		int a = assignment.Num("prem lata gupta");
		System.out.println(a);
	}
	int Num(String str){
		int count=0;

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch != ' ' ) {
				count++;
			}
		}
		return count;
	}
}
/*
OUTPUT
13
*/