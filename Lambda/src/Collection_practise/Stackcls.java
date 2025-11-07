package Collection_practise;

import java.util.Stack;

public class Stackcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.add(10);
		s.add(2);
		s.add(9);
		s.add(3);
		s.add(8);
		s.add(4);
		s.add(7);
		s.add(5);
		s.add(6);
		s.add(1);
		s.push(700);
		System.out.println(s);
		//s.pop();
		s.pop();
		System.out.println(s);
		

	}

}
