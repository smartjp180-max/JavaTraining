package practiseInterface;

import java.util.function.Function;

public class Functioncls {
	
	static Function<String, Integer> f1 = (x) -> x.length();
	static Function<String, String> f2 = (x) -> x.toLowerCase();
	static Function<String, String> f3 = (x) -> x.toUpperCase();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = f1.apply("Dharani");
		System.out.println("Name length is : " + result);

		String s1 = f2.apply("HEMA");
		System.out.println(s1);

		String s2 = f3.apply("venkatjp");
		System.out.println(s2);

		Function<Integer, Integer> x1 = x -> x * 3;
		Function<Integer, Integer> x2 = x -> x * x;
		System.out.println("And Then :" + x1.andThen(x2).apply(1));
		System.out.println("compose :" + x1.compose(x2).apply(2));

	}

}


