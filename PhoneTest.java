
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		myPhone.dial();
		byte speedNumber=123;
		myPhone.dial(speedNumber);
		String name="John";
		myPhone.dial(name);
		myPhone.dial(speedNumber,"John");
		myPhone.dial("John","Rocky");
		
		
		
	}

}

class Phone
{
	void dial() {
		System.out.println("Dialing now here....");
	}
	void dial(byte speedDial) {
		System.out.println("Dialing....."+speedDial);
	}
	void dial(String name) {
		System.out.println("Dialing to ....."+name);
	}
	void dial(byte b,String name) {
		System.out.println("Call made by "+name+" using "+b);
	}
	void dial(String name1,String name2) {
		System.out.println("Conference call with..."+name1+" and "+name2 );
	}
}