package patternPrograms;
public class IncreasingRightAngleWithNumbers {

	void PatternPrinting() {
		int count=1;
		//char count1='A';  //Changes made to incorporate Interview Question
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count +" ");
				//System.out.print(count1 +" ");   //Changes made to incorporate Interview Question
				count++;
				//count1++;   //Changes made to incorporate Interview Question
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		IncreasingRightAngleWithNumbers pattern=new IncreasingRightAngleWithNumbers();
		pattern.PatternPrinting();
	}
}

/*
OUTPUT
1 
2 3 
4 5 6 
7 8 9 10 
*/