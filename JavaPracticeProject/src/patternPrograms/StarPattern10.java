package patternPrograms;
public class StarPattern10 {

	void starPattern10() {
		int star=5,space=0;
		for(int i=1;i<=5;i++)	{
			for(int j=1;j<=space;j++)	{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			if(i<=2 ){
				star=star-2;
				space=space+1;
			}
			else {
				star=star+2;
				space=space-1;
			}
			System.out.println(" ");
		}
	}

	public static void main(String args[]){
		StarPattern10 star10 = new StarPattern10();
		star10.starPattern10();
	}
}

/*
OUTPUT
***** 
 *** 
  * 
 *** 
***** 
*/
