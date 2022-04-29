public class Finance {

	public static void main(String[] args) {
		
		Invest inv= new Invest();
		inv.f1();//1
		
		inv.f2(100000,5,7); //2
		
		int ans = inv.f3(100000,5,7); //3
		System.out.println("ans "+ans);
		
		int output = inv.f4();
		System.out.println("output "+output);
	}

}
// 
class Invest
{
	public void f1() {
		int amt=10000;
		int y=5;
		int i=7;
		int dep=amt*y*i;
		System.out.println("dep is "+dep);
		System.out.println("-------------------");
	}
	public void f2(int amt, int y , int i) {
		float dep=amt+(amt*y*i)/100;
		System.out.println("Amount invested is "+amt);
		System.out.println("For a period of years "+y);
		System.out.println("with interest of  "+i);
		System.out.println("total maturity  "+dep);
		System.out.println("-------------------");
	}
	public int f3(int amt, int y,int i) {
		int dep=amt+(amt*y*i)/100;
		System.out.println("Amount invested is "+amt);
		System.out.println("For a period of years "+y);
		System.out.println("with interest of  "+i);
		System.out.println("-------------------");
		return dep;
		
	}
	public int f4() {
		int p=1000;
		int i=10;
		int n=5;
		int sip=p*(((1+i)^n-1/i)*(1+i));
		System.out.println("SIP AMT is "+p);
		System.out.println("interest is "+i);
		System.out.println("period is "+n);
		System.out.println("-------------------");
		return sip;
		
		
	}
}