
package basicPrograms;
public class DivisibleByNumber {

	void divisibleby5(int startindex, int endIndex) {
		System.out.println("Numbers divisible by 5 are: ");
		for(int i=startindex;i<=endIndex;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
	}
	void divisibleby3(int startindex,int endIndex) {
		System.out.println("------------------------------------");
		System.out.println("Numbers divisible by 3 are: ");
		for(int x=startindex;x<=endIndex;x++) {
			if(x%3==0) {
				System.out.println(x);
			}
		}
	}

	public static void main(String[] args) {
		DivisibleByNumber number=new DivisibleByNumber();
		number.divisibleby5(10,20);
		number.divisibleby3(10,20);
	}
}

/*
OUTPUT
Numbers divisible by 5 are: 
10
15
20
------------------------------------
Numbers divisible by 3 are: 
12
15
18
*/