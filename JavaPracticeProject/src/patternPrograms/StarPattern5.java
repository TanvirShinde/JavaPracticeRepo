package patternPrograms;
public class StarPattern5 {

	void starPattern5() {
		int a=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(a);
				a++;
			}
			System.out.println(); 
		}
	}

	public static void main(String args[ ])	{
		StarPattern5 star5 = new StarPattern5();
		star5.starPattern5();
	}
}

/*
OUTPUT
123
456
789
*/