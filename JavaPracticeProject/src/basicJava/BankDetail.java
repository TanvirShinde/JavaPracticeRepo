package basicJava;
class BankDetail{
	static int balance;
	int Amt;

	void initBalance(int balance){
		BankDetail.balance=balance;
	}
	void creditAmt(int Amt){
		balance=balance+Amt;
	}

	void debitAmt(int Amt){
		balance=balance-Amt;
	}
	void display(){
		System.out.println("Your current balance is = " +balance);
	}
	public static void main(String[] args){
		BankDetail bankdetail= new BankDetail();
		bankdetail.initBalance(5000);
		bankdetail.creditAmt(2000);
		bankdetail.debitAmt(6500);
		bankdetail.creditAmt(1500);
		bankdetail.display();
	}
}

/*
OUTPUT
Your current balance is = 2000
*/