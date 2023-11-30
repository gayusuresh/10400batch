package oops;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(1001,"gayathri",90,78,99,67,88);
		
		System.out.println(s1);
		System.out.println("===============================");
		Student s2=new Student(1002,"ravi",55,67,88,99,66);
		
		System.out.println(s2);
		System.out.println("===============================");

		Student s3=new Student();
		s3.setsID(1003);
		s3.setsName("hari");
		System.out.println(s3.getSId());
		System.out.println(s3.getSName());
		
		
	}

}
