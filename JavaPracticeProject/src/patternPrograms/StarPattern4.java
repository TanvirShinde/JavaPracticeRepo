package patternPrograms;
public class StarPattern4 {

	void starPattern4() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(j);
			}
			System.out.println(); 
		}	
	}

	public static void main(String args[ ]){
		StarPattern4 star4 = new StarPattern4();
		star4.starPattern4();
	}
}

/*
OUTPUT
123
123
123
*/