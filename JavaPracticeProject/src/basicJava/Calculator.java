package basicJava;
class Calculator{

	int num1=10;
	int num2=2;
	int add;
	int sub;
	int mul;
	int div;
	int total;

	void add(){
		add=num1+num2;
		System.out.println("Addition is = " + add);
	}

	void sub(){
		sub=num1-num2;
		System.out.println("Subtraction is = " + sub);
	}

	void mul(){
		mul=num1*num2;
		System.out.println("Multiplication is = " + mul);
	}

	void div(){
		div=num1/num2;
		System.out.println("Division is = " + div);
	}

	void printTotal(){
		total=add+sub+mul+div;
		System.out.println("Total of (add + sub + mul + div) is = " +total);	
	}

	public static void main(String[] args){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
		calculator.printTotal();
	}
}

/*
OUTPUT
Addition is = 12
Subtraction is = 8
Multiplication is = 20
Division is = 5
Total of (add + sub + mul + div) is = 45
*/