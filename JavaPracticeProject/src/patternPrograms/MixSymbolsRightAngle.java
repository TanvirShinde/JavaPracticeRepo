package patternPrograms;
public class MixSymbolsRightAngle {

	void patternPrinting() {
		int i, j;
		for (i = 1; i <= 5; i++) { 
			for (j = 1; j <= i; j++) {
				if (j % 2 != 0) { 
					System.out.print("*");
				} else { 
					System.out.print("#");
				}
				System.out.print(" "); 
			}
			System.out.println(); 
		}
	}

	public static void main(String[] args) {
		MixSymbolsRightAngle pattern = new MixSymbolsRightAngle();
		pattern.patternPrinting(); 
	}
}

/*
OUTPUT
* 
* # 
* # * 
* # * # 
* # * # * 
*/