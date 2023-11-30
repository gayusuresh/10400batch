package strings;

import java.util.Arrays;

public class StringDemoExample {

	public static void main(String[] args) {
		String s="Hello";//literal
		String s1="Hello";
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.charAt(0));//H
		System.out.println(s.indexOf('H'));//0
		System.out.println(s.concat("hai"));//hellohai
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("H"));
		System.out.println(s.equals(s1));//boolean
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("o"));
	    System.out.println(s.trim());
	    System.out.println(s.length());
	    System.out.println(s.equalsIgnoreCase(s1));
	    System.out.println(s.compareToIgnoreCase(s1));
	    //s1 eqaul to s2==>0
	    //s1 higher than s2 ==>positive
	     //s1 lessthan s2==>negative
	    
	    System.out.println(s==s1);//check the memory
	    String data = "Personality";
	    //string to character conversion
	    char a[]=data.toCharArray();
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    
	    
	    char[] dest=new char[6];
	    data.getChars(3,9,dest,0);//start,endposition,char array variable na,e
	    //start pos
	    System.out.println(Arrays.toString(dest));
		
		System.out.println(s1.isEmpty());

		System.out.println(s1.isBlank());
		System.out.println(s.stripLeading());//front space
		System.out.println(s.stripTrailing());//back space
		System.out.println(s.repeat(2));
		System.out.println(s.contentEquals(s1));
		System.out.println(s);
	}

}
