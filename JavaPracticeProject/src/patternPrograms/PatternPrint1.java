package patternPrograms;
public class PatternPrint1 {

	void printGivenPattern() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		PatternPrint1 a38 = new PatternPrint1();
		a38.printGivenPattern();
	}
}
/*
OUTPUT
* 
* * 
* * * 
* * * * 
*/