package conditionalstatment;

import java.util.Scanner;

public class AlphabetExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the alphabet");
		char alphabet=sc.next().charAt(0);
		switch(alphabet)
		{
			case 'A','a':System.out.println("Apple");
			break;
			case 'B','b':System.out.println("Ball");
			break;
			case 'C','c':System.out.println("Cat");
			break;
			default:
				System.out.println("no matching data");
			
		}
		sc.close();

	}

}
