package stringPrograms;

class SpecificCharCountOfString{

	int getcharcount(String str, char ch){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'){
				count++;
			}
		}
		System.out.println("Count of character a is = "+count);
		return count;
	}
	public static void main(String[] args){
		SpecificCharCountOfString assignment20=new SpecificCharCountOfString();
		assignment20.getcharcount("aakanskha", 'a');
	}
}

/*

OUTPUT
Count of character a is = 4

*/
