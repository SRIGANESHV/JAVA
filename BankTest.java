public class BankTest {
	public static void main(String[] args) {
		BankAccount baObj1 = new BankAccount(101,"Jack",90000);
		BankAccount baObj2 = new BankAccount(102,"Jane",80000);
		BankAccount baObj3 = new BankAccount(103,"Rocky",100000);
		BankAccount baObj4 = null;
		baObj4 = new BankAccount(104,"John",50000);
		/*baObj1.setBankAccount(101,"Jack",90000);
		baObj1.printBankAccount();
		baObj1.withdraw(3000);
		baObj1.printBankAccount();
		
		BankAccount baObj2 = new BankAccount();
		baObj2.setBankAccount(102,"Jane",70000);
		baObj2.printBankAccount();
		baObj2.withdraw(7000);
		baObj2.printBankAccount();
		
		BankAccount baObj3 = new BankAccount();
		baObj3.setBankAccount(103,"Julie",80000);
		baObj3.printBankAccount();
		baObj3.withdraw(50000);
		baObj3.printBankAccount();*/
		
	}
}

//making the data member as private
// and allowing this data via accessible functions

class BankAccount
{
	//DATA MEMBER
	 int accountNumber; //FIELD
	private String accountHolderName; //FIELD
	private double accountBalance; //FIELD

	//METHODS - MEMBER FUNCTIONS
	//full mutator
	BankAccount(int x, String y, double z)
	{
		
		System.out.println("Constructor is called");
		/*if(x<0) {
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		}
		else
			accountNumber=x;
		
		if(y==null) {
			throw new RuntimeException("Account holder name cannot be null...terminating..");
		}
		else
			accountHolderName=y;
		
		if(z<0) {
			//RuntimeException r = new RuntimeException("some problem.....");
			//throw r;
			throw new RuntimeException("Account Balance cannot be in negative...terminating..");
		}
		else
			accountBalance=z;
	}
	
	//accessor 
	void printBankAccount() 
	{
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account HName   : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("-----------------------");
	}
	double withdraw(double amountToWithdraw) {
		System.out.println("Withdraw in progresss...");
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("Withdraw in done...");
		return accountBalance;*/
	}
}
	
/*
		int accountNumber;
		String accountHolderName;
		double accountBalance;
		accountNumber=101;
		accountHolderName="Jack";
		accountBalance=50000;
		
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account HName   : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		int accountNumber2;
		String accountHolderName2;
		double accountBalance2;
		accountNumber2=102;
		accountHolderName2="Jane";
		accountBalance2=60000;
		
		System.out.println("Account Number  : "+accountNumber2);
		System.out.println("Account HName   : "+accountHolderName2);
		System.out.println("Account Balance : "+accountBalance2);
		
		int accountNumber3;
		String accountHolderName3;
		double accountBalance3;
		accountNumber3=103;
		accountHolderName3="Julie";
		accountBalance3=70000;
		
		System.out.println("Account Number  : "+accountNumber3);
		System.out.println("Account HName   : "+accountHolderName3);
		System.out.println("Account Balance : "+accountBalance3);
		
		
*/