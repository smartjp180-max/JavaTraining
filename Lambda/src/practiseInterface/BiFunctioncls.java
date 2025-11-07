package practiseInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctioncls {

	static BiFunction<String, String, String> f1 = (x, y) -> x.concat(y);

	static Predicate<person> height = h -> h.getHeight() > 158;

	static Predicate<person> gender = g -> g.getGender().equals("Male");

	static BiFunction<List<person>, Predicate<person>, Map<String, Double>> persondata = (l, p) -> {
		Map<String, Double> map = new HashMap<>();
		l.forEach(l1 -> {
			if (p.test(l1)) {
				map.put(l1.getName(), l1.getSalary());
			}
		});
		return map;
	};

	public static void main(String[] args) {

		String s = f1.apply("Jp is ", "genius");
		System.out.println(s);

		Map<String, Double> m = persondata.apply(Repository.getAllPerson(), height);
		System.out.println(m);

	}
}
