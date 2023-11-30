package loops;

import java.util.Scanner;

public class MultipleOfthreeExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();//10
		int start=1;
		while(start<=n)//1<=10
		{
			if(start%3==0)
			{
				
				System.out.println(start);
			}
			start++;
		}

	}

}
