package Collection_practise;

import java.util.LinkedList;

public class Linkedlistcls {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(5);
		ll.add(9);
		ll.add(2);
		ll.add(10);
		ll.add(3);
		ll.add(6);
		ll.add(4);
		ll.add(7);
		ll.add(1);
		ll.add(8);
		System.out.println(ll);
		
		ll.offer(11);
		
		//System.out.println(ll.offer(11));
		System.out.println(ll);
		
		ll.peek();
		System.out.println(ll.peek());
		ll.get(5);
		System.out.println(ll.get(5));
		
		
	}

}
