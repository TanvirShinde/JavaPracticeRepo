package rohan;
public class SecMaxWord {

	public static void main(String[] args) {
		SecMaxWord sec = new SecMaxWord();
		String[] str = {"Rohan","Tanvir123","Deepak1234","Sagar","Hardik256413"};
		String Output = sec.secMax(str);
		System.out.println(Output);

	} 
	String secMax(String[] str) {
		String Max = str[0];
		String SecMax = str[1];
		if(str[1].length() > Max.length()) {
			SecMax = Max ;
			Max = str[1];
		}
		for(int i=2 ;i<str.length;i++) {
			if(Max.length() < str[i].length()) {
				SecMax = Max ;
				Max = str[i];
			}
			else if (SecMax.length()<str[i].length()) {
				SecMax = str[i];
			}
		}
		return Max;
	}
}
/*
OUTPUT
Hardik256413
*/