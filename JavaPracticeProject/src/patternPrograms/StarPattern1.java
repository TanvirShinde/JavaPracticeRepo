package patternPrograms;
public class StarPattern1 {

	void starPattern() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i%2==0) {                        //(i==2||i==4)
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
		StarPattern1 star = new StarPattern1();
		star.starPattern();
	}
}

/*
OUTPUT
**** 
#### 
**** 
#### 
*/