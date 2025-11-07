package java8;

import java.util.function.UnaryOperator;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> func = x-> x*7;
		int p=func.apply(10);
		System.out.println(p);
		
		UnaryOperator<Integer> func1 = x -> x*100;
		System.out.println(func1.apply(8));

	}

}
