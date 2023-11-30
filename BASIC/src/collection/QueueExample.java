package collection;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer>p=new PriorityQueue<Integer>();
		
		System.out.println(p);
		System.out.println(p.peek());//its retrieve the data from the first position
		System.out.println(p.poll());//its retrieve and remove from the first position
		System.out.println(p);
		System.out.println(p.element());//its retrieve the data from the first position
		System.out.println(p.remove());//its retrieve and remove from the first position
		//System.out.println(p);

	}

}
