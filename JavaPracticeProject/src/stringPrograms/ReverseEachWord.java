package stringPrograms;
public class ReverseEachWord {

	public static void main(String[] args) {

		String a ="Rohit is a Automation tester";

		String [] b= a.split(" ");

		for(int i=b.length-1; i>=0; i--)
		{
			System.out.print(" ");

			System.out.print(b[i]);
		}
	}

}

/*

OUTPUT 
tester Automation a is Rohit

*/