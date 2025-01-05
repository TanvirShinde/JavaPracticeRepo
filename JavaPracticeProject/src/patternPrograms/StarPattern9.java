package patternPrograms;
public class StarPattern9 {

	void starPattern9() {
		int star=1,space=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)	{
				System.out.print("*");
			}
			if(i<=3 ){
				star=star+2;
				space=space-1;
			}
			else {
				star=star-2;
				space=space+1;
			}
			System.out.println(" ");	
		}
	}

	public static void main(String args[]){
		StarPattern9 star9 = new StarPattern9();
		star9.starPattern9();
	}
}

/*
OUTPUT
   * 
  *** 
 ***** 
******* 
 ***** 
  *** 
   * 
*/