
public class StaticNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Sriganesh", 1, 100000);
		Employee e2 = new Employee("Nagarjun",2,200000);
		System.out.println("Employee name is "+e1.empName+"Employee id is"+e1.empID+"Salary "+e1.empSal+"Works for "+e1.getEmporg());
		System.out.println("Employee name is "+e2.empName+"Employee id is"+e2.empID+"Salary "+e2.empSal+"Works for "+e2.getEmporg());
		String w=e1.getEmporg();
		System.out.println(w);
	}

}
class Employee
{
	static String empOrg="SBI";
	String empName;
	int empID;
	double empSal;
	public Employee(String empName, int empID, double empSal) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empSal = empSal;
	}
	String getEmporg() {
		return empOrg;
	}

}
