package stringPrograms;
public class ReverseEachWordOfGivenString {

	public static void main(String[] args) {

		String a = "Hello I am Tanvir Shinde";

		String word[] = a.split(" ");

		for(String element: word)
		{
			System.out.print(" ");

			for(int i=element.length()-1; i>=0; i--)
			{
				char b = element.charAt(i);

				System.out.print(b);
			}
		}
	}

}

/*

OUTPUT 

 olleH I ma rivnaT ednihS
 
 */