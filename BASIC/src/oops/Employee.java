package oops;

public class Employee 
{
	private int eId;
	String eName;
	int salary;
	String address;
	
	double annualSalary()
	{
		int annualSal=salary*12;
		return annualSal;
	}
	double Pf()
	{
		double pf=(salary*18)/100.0;
		return pf;
	}

}
