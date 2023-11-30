package loops;

import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//123
		int rev=0,digit=0;
		for(;n!=0;)
		{
			digit=n%10;//123%10=3 12%10=2 1%10=1
			rev=rev*10+digit;//rev=0*10=0+3=3 rev=3*10=30+2=32 rev=32*10=320+1=321
			n=n/10;//123/10=12 12/10=1 
			
		}
		
		System.out.println("The reverse =:"+rev);
	}
	

}
