package patternPrograms;
public class StarPattern6 {

	void starPattern6() {
		char ch='A';
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println(); 
		}	
	}

	public static void main(String args[ ]){
		StarPattern6 star6 = new StarPattern6();
		star6.starPattern6();
	}
}

/*
OUTPUT
AAA
BBB
CCC
*/