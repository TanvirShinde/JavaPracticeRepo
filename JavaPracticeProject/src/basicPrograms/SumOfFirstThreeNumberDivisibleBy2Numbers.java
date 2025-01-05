package basicPrograms;
class SumOfFirstThreeNumberDivisibleBy2Numbers{
	void nosdivisible1(int startRange, int endRange){
		int count=0;
		int sum=0;
		int avg=0;
		for(int i=startRange;i<=endRange;i++){
			if(i%5==0 && i%7==0){
				count++;
				sum=sum+i;
				avg=sum/3;
				if(count==3){
					break;
				}
			}
		}
		System.out.println("Sum of first 3 numbers is "+sum +" and "+" Average of first 3 Numbers is " +avg);	
	}

	public static void main(String[] args){
		SumOfFirstThreeNumberDivisibleBy2Numbers sum=new SumOfFirstThreeNumberDivisibleBy2Numbers();
		sum.nosdivisible1(1,210);
	}
}

/*
OUTPUT
Sum of first 3 numbers is 210 and  Average of first 3 Numbers is 70
*/