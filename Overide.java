import java.time.LocalDate;

public class Overide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Captain ref = new Captain();
		ref.fly();
		
		ref=new Jetfleet();
		ref.fly();
		
		ref=new Hawkers();
		ref.fly();
		
		ref=new Falcons();
		ref.fly();
		
		ref = new Mavericks();
		ref.fly();
	}
}

class Captain
{
	void fly()
	{
		System.out.println("I'm the Captain");
	}
}
class Jetfleet extends Captain
{
	void fly()
	{
		System.out.println("We are ready to fly the Jets");
	}
}
class Hawkers extends Jetfleet
{
	void fly()
	{
		System.out.println("We are the Hawkers");
	}
}
class Falcons extends Hawkers
{
	void fly()
	{
		System.out.println("We are the Falcons");
	}
}
class Mavericks extends Falcons
{
	void fly()
	{
		System.out.println("We are the Mavericks Top Gun");
	}
}
		