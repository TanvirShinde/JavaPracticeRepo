package patternPrograms;
public class Pyramid4 {

	void pyramid4 () {
		int star=7,space=0;//(spaces before star)
		for(int i=1;i<=4;i++){
			for(int j=1;j<=space;j++)	{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			star=star-2;
			space=space+1;
			System.out.println(" ");
		}	
	}

	public static void main(String args[]){
		Pyramid4 pattern = new Pyramid4 ();
		pattern.pyramid4();
	}
}

/*
OUTPUT
******* 
 ***** 
  *** 
   * 
*/