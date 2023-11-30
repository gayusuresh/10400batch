package variablesanddatatypes;

import java.util.Scanner;

public class Student {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the Address");
		String address=sc.next();
		System.out.println("enter the marks");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int total=m1+m2+m3+m4+m5;
		double percentage=(total*100)/500.0;
		System.out.println("The Student id=:"+id);
		System.out.println("The Student Name=:"+name);
		System.out.println("The adress is=:"+address);
		System.out.println("The Total=:"+total);
		System.out.println("The percentage=:"+percentage);

	}

}
