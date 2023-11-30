package streamexample;

import java.util.Random;

public class RandomNumberExample {

	public static void main(String[] args) {
		Random r=new Random();
		for(int i=0;i<=20;i++)
		{
       float x=r.nextFloat(100);
       System.out.println(x);
		}
       
	}

}
