
package patternPrograms;
class RightAngleWithNumbers{
	void patternprinting(){
		int i;
		int j;
		for( i=1;i<=4;i++){
			for(j=1;j<=i;j++){
				System.out.print(j +" ");	
			}
			System.out.println();	
		}
	}
	public static void main(String[] args){
		RightAngleWithNumbers pattern=new RightAngleWithNumbers();
		pattern.patternprinting();
	}
}

/*
OUTPUT
1 
1 2 
1 2 3 
1 2 3 4 
*/