
public class HealthYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Health h = new Health();
		h.oxy();
		h.bp(150, 100);
		//System.out.println("BP is " +);
		int ans = h.bmi(110, 80);
		System.out.println("BMI is " + ans);
		System.out.println("*********************");
		int out = h.steps();
		System.out.println("Your total steps today are " + out);
		System.out.println("*********************");
	}
}

	class Health {
		public void oxy() {
			int spo2 = 96;
			if (spo2 >= 96) {
				System.out.println("You are healthy and Oxycool. Your SPO2 is "+spo2);
				System.out.println("*********************");
			} else {
				System.out.println("Please do breathing exercise ");
				System.out.println("*********************");}
		}

		public void bp(int sp, int dp) {
			if (sp == 120 && dp == 80) {
				System.out.println("BP is : "+sp+"/"+dp);
				System.out.println("Your BP is normal");
				System.out.println("*********************");
			} else {
				System.out.println("Please seek medical help ");
				System.out.println("*********************");}
		}

		public int bmi(int ht, int wt) {
			int bmindex = 100;
			int val = (ht + wt) - bmindex;
			if (val > 100) {
				System.out.println("Your BMI is in control");
				
			} else
				System.out.println("Please go for diet control");
			return val;
		}

		public int steps() {
			int walk = 10000;
			if (walk >= 10000) {
				System.out.println("Did you know Your awesome. Reach an extra mile");
			} else
				System.out.println("Please walk . You can do more");
			return walk;
		}
	}

