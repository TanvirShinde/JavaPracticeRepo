
package basicPrograms;
public class EvenNumbers {

	void evenNumber(int startRange,int endRange) {
		System.out.println("All Even Numbers from " +startRange +" to " +endRange +" for Menthod evenNumber are: ");
		for(int i=startRange;i<=endRange;i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}	
	}
	void evenNumber1(int startRange,int endRange) {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("All Even Numbers from " +startRange +" to " +endRange +" for Method evenNumber1 are : ");
		int i=startRange;
		for(;i<=endRange;i++) {
			if(i%2==0){
				System.out.println(i);
			}
		}	
	}

	public static void main(String[] args) {
		EvenNumbers number=new EvenNumbers();
		number.evenNumber(1,10);
		number.evenNumber1(11,20);
	}
}

/*
OUTPUT
All Even Numbers from 1 to 10 for Menthod evenNumber are: 
2
4
6
8
10
-----------------------------------------------------------------------------
All Even Numbers from 11 to 20 for Method evenNumber1 are : 
12
14
16
18
20
*/
