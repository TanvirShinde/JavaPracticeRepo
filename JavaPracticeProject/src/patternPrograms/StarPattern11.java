package patternPrograms;
public class StarPattern11 {

	void starPattern11() {
		int star=1,space=0;
		for(int i=1;i<=7;i++){
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			if(i<=3 ){
				star=star+1;
			}
			else {
				star=star-1;
			}
			System.out.println(" ");
		}
	}

	public static void main(String args[])	{
		StarPattern11 star11 = new StarPattern11();
		star11.starPattern11();
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
