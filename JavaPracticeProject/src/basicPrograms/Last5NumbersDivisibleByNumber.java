package basicPrograms;
class Last5NumbersDivisibleByNumber{
	void nosdivisible1(int startRange, int endRange){
		int count=0;
		int i;
		System.out.println("Last 5 Numbers divisible by 5 are = ");
		for(i=endRange;i>=startRange;i--){
			if(i%5==0){
				System.out.println(i);
				count++;
				if(count==5){
					break;
				}
			}
		}	
	}

	public static void main(String[] args){
		Last5NumbersDivisibleByNumber number=new Last5NumbersDivisibleByNumber();
		number.nosdivisible1(10,500);
	}
}

/*
OUTPUT
Last 5 Numbers divisible by 5 are = 
500
495
490
485
480
*/