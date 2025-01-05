package patternPrograms;
public class IncreaseSameNumberByRow {

	void patternPrinting() {

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		IncreaseSameNumberByRow pattern=new IncreaseSameNumberByRow();
		pattern.patternPrinting();
	}

}

/*
OUTPUT
1 
2 2 
3 3 3 
4 4 4 4 
*/