package basicJava;
public class ConditionalStatements {

	void grade(int score) {

		if(score>90 && score<=100){
			System.out.println("Grade is A+");
		}else if(score>80 && score<=90) {
			System.out.println("Grade is A");
		}else if(score>70 && score<=80) {
			System.out.println("Grade is B+");
		}else if(score>60 && score<=70) {
			System.out.println("Grade is B");
		}else if(score>=50 && score<=60) {
			System.out.println("Grade is C");
		}else if(score<50 && score>=0) {
			System.out.println("Your Score is " +score +" you need to Work Harder");
		}else {
			System.out.println("Invalid Score");
		}	
	}
	public static void main(String[] args) {
		ConditionalStatements score=new ConditionalStatements();
		score.grade(7);
	}
}

/*
OUTPUT
Your Score is 7 you need to Work Harder
*/