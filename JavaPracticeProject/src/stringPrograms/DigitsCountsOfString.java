package stringPrograms;
class DigitsCountsOfString{
	int count;
	int returnTotalgdigits(String str){
		for(int i=0;i<str.length();i++){
			boolean flag=Character.isDigit(str.charAt(i));
			if(flag==true){
				count++;
			}
		}
		System.out.println("Total Numbers of digits in given input is = "+count);
		return count;		
	}

	public static void main(String[] args){
		DigitsCountsOfString digitcount=new DigitsCountsOfString();
		digitcount.returnTotalgdigits("aa1kan33ks4h5a");
	}
}

/*

OUTPUT
Total Numbers of digits in given input is = 5

*/