package basicJava;

class BankBalanceUpdation{
	static int balance;
	int Amt;
	
	void initBalance(int balance){
		
		BankBalanceUpdation.balance=balance;
	}
	void creditAmt(int Amt){
		balance=balance+Amt;
	}
	
	void debitAmt(int Amt){
		if(balance< Amt){
			System.out.println("Insufficient balance, your ask is "+Amt+" rs but you have only "+balance+" rs");
		}
			else {
			balance=balance-Amt;
			}
		
	}
	void display(){
		System.out.println("Your current balance is = " +balance +" rs");
	}
	public static void main(String[] args){
	
		BankBalanceUpdation bankdetail= new BankBalanceUpdation();
		bankdetail.initBalance(5000);
		bankdetail.creditAmt(2000);
		bankdetail.creditAmt(500);
		bankdetail.debitAmt(9500);
		bankdetail.creditAmt(1500);
		bankdetail.debitAmt(6000);
		bankdetail.display();
	}
}
