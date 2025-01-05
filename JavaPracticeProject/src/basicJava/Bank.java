package basicJava;
class Bank{
	int balance=1000;

	void creditAmt(){
		balance=balance+300;
		System.out.println("300 Rs Credited to Your Account, Your Current balance is " +balance +" Rs");
	}

	void debitAmt(){
		balance=balance-500;
		System.out.println("500 Rs Debited from youur Account, Your Current balance is " +balance +" Rs");
	}

	void display(){
		System.out.println("Your Current balance is " +balance +" Rs");
	}

	public static void main(String[] args){
		Bank bank=new Bank();
		bank.creditAmt();
		bank.debitAmt();
		bank.creditAmt();
		bank.display();
	}
}

/*
OUTPUT
300 Rs Credited to Your Account, Your Current balance is 1300 Rs
500 Rs Debited from youur Account, Your Current balance is 800 Rs
300 Rs Credited to Your Account, Your Current balance is 1100 Rs
Your Current balance is 1100 Rs
*/