package oops;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.eId=1001;
		e1.eName="jack";
		e1.salary=34000;
		e1.address="kknagar";
		System.out.println(e1.eId);
		System.out.println(e1.eName);
		System.out.println(e1.address);
		System.out.println(e1.salary);
		System.out.println(e1.annualSalary());
		System.out.println(e1.Pf());

	}

}
