package stringPrograms;

class StringReverse{
	void stringReverse(String input ){
			
		for(int i=input.length()-1;i>=0;i--){
			System.out.print(input.charAt(i));
		}
	}
	public static void main(String[] args){
		StringReverse assignment19=new StringReverse();
		assignment19.stringReverse("te ch3no");
	}
}

/*

OUTPUT
on3hc et

*/