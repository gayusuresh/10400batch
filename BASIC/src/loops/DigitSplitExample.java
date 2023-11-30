package loops;

import java.util.Scanner;

public class DigitSplitExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//123
		int digit=0;
		for(;n!=0;)
		{
			digit=n%10;//3
			System.out.println(digit);//3 2 1
			n=n/10;//n=12 n=1 0
		}
		
		
	}

}
