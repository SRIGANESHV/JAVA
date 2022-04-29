
public class AssociationNewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dolphin d = new Dolphin();
		Echo e=d.echoing();
		Sound s=e.frequency();
		Ultrasound u=s.noise();
		u.echolocation();
	}

}
class Mammals
{
	
}
class DorsalFin
{
	
}
class Flipper
{
	
}
class Jump
{
	
}
class AquaticMammals extends Mammals
{
	DorsalFin fin =new DorsalFin();
	Flipper fp = new Flipper();
	Jump jp= new Jump();
}
class Dolphin extends AquaticMammals
{
	Echo echoing() {
		Echo e = new Echo();
		return e;
	}
}
class Echo extends Sound
{
	Sound frequency() {
		Sound s = new Sound();
		return s;
	}
}
class Sound 
{
	Ultrasound noise() {
		Ultrasound u =new Ultrasound();
		return u;
	}
}
class Ultrasound extends Sound
{
	void echolocation(){
		System.out.println("Found echo location");
	}
}