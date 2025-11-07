package java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Integer> func =(x1,x2) -> x1+x2;
		int t =func.apply(10, 20);
		System.out.println(t);
		
		//Bi Function
		BiFunction<Integer,Integer,Integer> func1 = (x1,x2)->x1+x2;	
		int y = func1.apply(30, 40);
		System.out.println(y);
		
	}

}
