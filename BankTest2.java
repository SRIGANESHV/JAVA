
public class BankTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcct ba = new BankAcct(123, "Rocky", 10000,"1234567890");
		System.out.println("************************");

		SavAcct sa = new SavAcct(124, "John", 50000, 2.5,"1234567890");
		System.out.println("************************");

		FdAcct fa = new FdAcct(125, "Arnold", 100000, 7, 1,"1234567890");
		System.out.println("************************");

		ba.printBankAcct();
		System.out.println("************************");

		sa.printBankAcct1();
		double si = sa.calcSI();
		System.out.println("Simple Interest is " + si);
		System.out.println("************************");

		fa.printBankAcct();
		double fd = fa.calcFD();
		System.out.println("Fixed Deposit maturity is " + fd);
		System.out.println("************************");
		
		CurrentAcct ca = new CurrentAcct(111, "M/S Steels Ltd", 100000,"1234567890");
		ca.printBankAcct();
		System.out.println("************************");

	}

}

class BankAcct {
	private int acctNo;//Field
	private String acctName;//Field
	protected double acctBal;//Field
	String mobileNumber;//Field
	// private LocalDate acctOpenDate;

	BankAcct(int a, String b, double c,String m) {
		if (a < 0) {
			throw new RuntimeException("Account number cannot be in less than 0. PLease enter valid acct number");
		} else
			acctNo = a;
		if (b == null) {
			throw new RuntimeException("Account name cannot be null. PLease enter valid name");
		} else
			acctName = b;
		if (c < 0) {
			throw new RuntimeException("Account balance cannot be less than zero ");
		} else
			acctBal = c;
			mobileNumber=m;
	}
	
	void setMobileNo(String m) {
		System.out.println("The new mobile number is "+m);
		mobileNumber=m;
	}
	
	void setName(String name) {
		System.out.println("The Amended account holder's name is "+name);
		acctName=name;
		
	}
	
	void printBankAcct() {
		System.out.println("Account Number  : " + acctNo);
		System.out.println("Account Name    : " + acctName);
		System.out.println("Account Balance : " + acctBal);
		System.out.println("Mobile Number   : " + mobileNumber);
		System.out.println("-----------------------");
	}
	
	double getBalance() { //accessor
		return acctBal;
	
	
	}		
}

class SavAcct extends BankAcct
{
	protected double rOI;

	SavAcct(int ab, String bb, int c, double r,String m) {
		super(ab, bb, c,m);
		if (r < 0) {
			throw new RuntimeException("ROI cannot be less than zero ");
		} else
			rOI = r;
	}

	void printBankAcct1() 
	{
		super.printBankAcct();
		System.out.println("Rate of Interest is  : " + rOI);
		System.out.println("-----------------------");
	}

	double calcSI() {
		return (super.acctBal * rOI * 1) / 100;
	}
}

class FdAcct extends SavAcct {
	private int tenure;

	FdAcct(int a, String b, int c, double r, int t,String m) {
		super(a, b, c, r,m);
		if (t < 0) {
			throw new RuntimeException("Tenure cannot be less than 0");
		} else
			tenure = t;
	}

	void printBankAcct() {
		super.printBankAcct();
		System.out.println("Fixed Deposit Tenure    : " + tenure);
		System.out.println("-----------------------");
	}

	double calcFD() {
		double interest = Math.pow((1 + rOI / 100), tenure);
		double tot = acctBal * interest;
		return tot;
	}
}

class CurrentAcct extends BankAcct {
	CurrentAcct(int a, String b, int c,String m)
	{
		super(a,b,c,m);
		
		if (c < 10001) {
			System.out.println("Regular Variant Current Account opened");
		} else if (c>=10001 || c<100001)
			System.out.println("Gold variant Current Account opened");
		else if (c>=100001 || c<200001)
			System.out.println("Platinum variant Current Account opened");
		else if (c>=200001)
			System.out.println("Diamond variant Current Account opened");	
	
	}

}
