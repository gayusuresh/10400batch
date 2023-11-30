package operators;

import java.util.Scanner;

public class EvenNumberExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inputs");
		int n=sc.nextInt();
		boolean res= n%2==0;
		System.out.println(res);

	}

}
