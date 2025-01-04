package programs_on_numbers;
public class LastNumDivby5 {
	
	int returnLaastNumberDivBy5(int startNum, int endNum) {
		int num = endNum;
		for(; num >= startNum; num--) {
			if(num % 5 == 0) {
				break;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		LastNumDivby5 a16 = new LastNumDivby5();
		int lastNum = a16.returnLaastNumberDivBy5(10, 498);
		System.out.println(lastNum + " is the last number which is div by 5 in the given range.");
	}
}

/*

OUTPUT
495 is the last number which is div by 5 in the given range.

*/