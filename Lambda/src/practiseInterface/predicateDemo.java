package practiseInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<movies> ml1 = new ArrayList<movies>();

		movies m1 = new movies();
		m1.setActor("Vijay");
		m1.setName("Puli");
		m1.setYear("2020");

		movies m2 = new movies();
		m2.setActor("Rajini");
		m2.setName("2.0");
		m2.setYear("2021");

		ml1.add(m1);
		ml1.add(m2);

//		PredicateDemo p = new PredicateDemo();
//		p.vijayMovie(ml1);
//
//		vijayMovie(ml1);

		Predicate<movies> pm = p -> p.getActor() == "Vijay";
		Predicate<movies> pm1 = p -> p.getYear() == "2021";
		common(ml1, pm);
		common(ml1, pm1);

	}

	public static void common(List<movies> movie, Predicate<movies> p) {
		for (movies m : movie) {
			if (p.test(m)) {
				System.out.println(m.getName());
			}
		}
	}

//	public static void movieYear(List<Movie> movie) {
//		for (Movie m : movie) {
//			if (m.getYear() == "2020") {
//				System.out.println(m.getName());
//			}
//		}
//
//	}
//
//	public static void vijayMovie(List<Movie> movie) {
//		for (Movie m : movie) {
//			if (m.getActor() == "Vijay") {
//				System.out.println(m.getName());
//			}
//		}
//
//	}

}
