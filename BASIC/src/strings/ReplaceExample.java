package strings;

import java.util.Scanner;

public class ReplaceExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String sentence=sc.nextLine();
		System.out.println(sentence.replace("D", "t"));

	}

}
