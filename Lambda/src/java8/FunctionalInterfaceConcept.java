package java8;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> func = x -> x.length();
		int len=func.apply("this is Java 8");
		System.out.println(len);
		
//		chaining function
		Function<Integer, Integer> func2 = x -> x*2;
		int r = func.andThen(func2).apply("This is Jp");
		System.out.println(r);
		

	}

}
