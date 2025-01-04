package patternPrograms;
public class RightAngle {
	
	void patternprinting() {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
			System.out.print("*");
			
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		RightAngle pattern2=new RightAngle();
		pattern2.patternprinting();
	}

}