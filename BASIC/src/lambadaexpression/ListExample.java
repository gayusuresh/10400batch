package lambadaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,13,14,14,16,17);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}

System.out.println("multi line lambada ");

list.forEach(x->{
int y=x+2;
System.out.println(y);
});
System.out.println("single line lambada ");
list.forEach(x->System.out.println(x));

System.out.println("method ref");
list.forEach(System.out::println);

}}