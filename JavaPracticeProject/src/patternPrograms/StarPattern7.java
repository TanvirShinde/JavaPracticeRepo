package patternPrograms;
public class StarPattern7 {

	void starPattern7() {
		for(int i=1;i<=3;i++) {
			char ch='A';
			for(int j=1;j<=3;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println(); 
		}
	}

	public static void main(String args[ ])	{
		StarPattern7 star7 = new StarPattern7();
		star7.starPattern7();	
	}
}

/*
OUTPUT
ABC
ABC
ABC
*/
