package rohan;
public class SecMaxWord2 {

	public static void main(String[] args) {
		SecMaxWord2 sec = new SecMaxWord2();
		String[] str = {"Rohan","Tanvir","Deepak","Sagar","Hardik2"};
		sec.secMax(str);
	} 
	void secMax(String[] str) {
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
			}else if (SecMax.length()<str[i].length()) {
				SecMax = str[i];
			}
		}
		AllSecMaxCall(str, SecMax.length());
		return ;
	}
	void AllSecMaxCall(String[] str , int length) {
		for(int i=0 ;i<str.length;i++) {
			if(str[i].length() == length) {
				System.out.println(str[i]);
			}
		}		
	}
}

/*
OUTPUT
Tanvir
Deepak
*/