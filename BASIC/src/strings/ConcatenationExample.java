package strings;

import java.util.Scanner;

public class ConcatenationExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the firstname");
		String firstname=sc.next();
		System.out.println("enter the lastname");
		String lastname=sc.next();
		String fullname=firstname.concat(lastname);
		System.out.println("The FullName=:"+fullname);

		

	}

}
