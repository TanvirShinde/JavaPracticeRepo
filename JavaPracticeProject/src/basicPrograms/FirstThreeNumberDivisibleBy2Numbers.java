package basicPrograms;
class FirstThreeNumberDivisibleBy2Numbers{
	void nosdivisible1(int startRange, int endRange){
		int count=0;
		int i;
		System.out.println("First 3 Numbers divisible by 3 and 4 are = ");
		for(i=startRange;i<=endRange;i++){
			if(i%3==0 && i%4==0){
				System.out.println(i);
				count++;
				if(count==3){
					break;
				}
			}
		}
	}

	public static void main(String[] args){
		FirstThreeNumberDivisibleBy2Numbers number=new FirstThreeNumberDivisibleBy2Numbers();
		number.nosdivisible1(10,500);
	}
}

/*
OUTPUT
First 3 Numbers divisible by 3 and 4 are = 
12
24
36
*/