package patternPrograms;
public class StarPattern12 {

	void starPattern12() {
		int star=1,space=3;
		for(int i=1;i<=7;i++)	{
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			if(i<=3 ){
				star=star+1;
				space=space-1;
			}
			else {
				star=star-1;
				space=space+1;
			}
			System.out.println(" ");
		}
	}

	public static void main(String args[]){
		StarPattern12 star12 = new StarPattern12();
		star12.starPattern12();
	}
}

/*
OUTPUT
   * 
  ** 
 *** 
**** 
 *** 
  ** 
   * 
*/
