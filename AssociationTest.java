
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcct x = new BankAcct(101,"Jack",50000,"1234567890");
		x.printBankAcct();
		System.out.println("----");
		BankAdmin1 admin = new BankAdmin1();
		admin.changeMobileNo(x, "9920445566");
		System.out.println("======");
		x.printBankAcct();
		admin.changeName(x,"Jonty");
		x.printBankAcct();
		

	}
}
class BankAdmin1
{
	void changeMobileNo(BankAcct y, String z) { // y=x;
		y.setMobileNo(z);
	}

	void changeName(BankAcct n, String s) {
		n.setName(s);
	}
	}



