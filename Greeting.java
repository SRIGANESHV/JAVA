
public class Greeting {

	public static void main(String[] args) {
		System.out.println("Greetings from java");
		System.out.println("Welcome to the world of java programming");
		Home h = new Home();
		h.doRegister();
	}

}

class Home {
	void doRegister() {
		System.out.println("doRegister initiated...");
		Registration r = new Registration();
		r.NewRegistration();
		doLogin();
	}

	void doLogin() {
		System.out.println("Login initiated...");
		Login l = new Login();
		l.authenticate();
	}

}

class Login {
	void authenticate() {
		System.out.println("Authentication initiated....");
		Govtdashboard g = new Govtdashboard();
		g.showDashboard();
	}
}

class Registration {
	void NewRegistration() {
		System.out.println("Registration initiated....");
	}
}

class Govtdashboard {
	void showDashboard() {
		System.out.println("Govt Transaction Dashboard is presented....");
		StateGovt s = new StateGovt();
		s.doTreasury();
		s.doRTO();
		CntlGovt c = new CntlGovt();
		c.doIT();
		c.doRLY();
		c.doGST();
		Logout l = new Logout();
		l.doLogout();

	}

}

class StateGovt {
	void doTreasury() {
		System.out.println("Treasury txn completed....");
	}

	void doRTO() {
		System.out.println("RTO challan generated....");
	}

}

class CntlGovt {
	void doIT() {
		System.out.println("IT challan generated....");
	}

	void doRLY() {
		System.out.println("Railway receipts generated....");
	}

	void doGST() {
		System.out.println("GST receipts generated....");
	}

}

class Logout {
	void doLogout() {
		System.out.println("Doing Logout..");
	}
}