package patternPrograms;
public class StarPattern8 {

	void starPattern8() {
		char ch='A';
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println(); 
		}
	}

	public static void main(String args[ ]){
		StarPattern8 star8 = new StarPattern8();
		star8.starPattern8();
	}
}
