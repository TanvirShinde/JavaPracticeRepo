package patternPrograms;
public class pattern3 {

	public static void main(String[] args) {
		char ch = 'a';
		for(int i=1;i<=4;i++) {
			for(int j=2 ;j<=i;j++) {
				System.out.print("   ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print(ch+"* ");
				ch++;
			}
			System.out.println();
		}

	}
}
/*
OUTPUT
a* b* c* d* 
   e* f* g* 
      h* i* 
         j* 
*/