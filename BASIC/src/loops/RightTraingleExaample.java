package loops;

import java.util.Scanner;

public class RightTraingleExaample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();//5
		for(int i=1;i<=n;i++)//1<=5 2<=5 3<=5 4<=5 5<=5
		{
			for(int space=1;space<=n-i;space++)//1<=5-1=4 2<=4
				//3<=4 4<=4 5<=4
				//1<=5-2=3 2<=3 3<=3 4<=3=f
				//1<=5-3=2 2<=2
				//1<=5-4=1
				//1<=5-5=0
				
			{
				System.out.print(" ");//ssss
				                        //sss
				                        //ss
				                        //s
			}
			for(int k=1;k<=i;k++)//1<=1 2<=1=f
				                //1<=2 2<=2 3<=2
				                 //1<=3 2<=3 3<=3 4<=3
				                //1<=4 2<=4 3<=4 4<=4
				                 //1<=5 2<=5 3<=5 4<=5 5<=5
			{
				System.out.print("*");//    *
				                    //   **
				                   //   ***
				                  //   ****
				                 //   *****
			}
			System.out.println();
		}

	}

}
