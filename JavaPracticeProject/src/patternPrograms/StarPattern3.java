package patternPrograms;
public class StarPattern3 {

	void starPattern3() {
		for(int i=1;i<=3;i++) 	{
			for(int j=1;j<=3;j++) {
				System.out.print(i);
			}
			System.out.println(); 
		}
	}

	public static void main(String args[ ]){
		StarPattern3 star3 = new StarPattern3();
		star3.starPattern3();
	}
}

/*
OUTPUT
111
222
333
*/