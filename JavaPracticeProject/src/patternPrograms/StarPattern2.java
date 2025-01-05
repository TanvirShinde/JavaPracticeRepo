package patternPrograms;
public class StarPattern2 {
	
	void starPattern() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) 	{
				if(j==2||j==4){                 
					System.out.print("#");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println(" "); 
		}
	}

	public static void main(String args[ ]){
		StarPattern2 star = new StarPattern2();
		star.starPattern();
	}
}

/*
OUTPUT
*#*# 
*#*# 
*#*# 
*#*# 
*/