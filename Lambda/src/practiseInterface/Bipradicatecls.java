package practiseInterface;

import java.util.List;
import java.util.function.BiPredicate;

public class Bipradicatecls {
	
	static BiPredicate<String, Integer> heightandgender = (gender, height) -> gender.equals("Female") && height > 158;

	static BiPredicate<String, List<String>> musictandgender = (gender, hobbies) -> gender.equals("Female")
			&& hobbies.contains("music");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<person> l1 = Repository.getAllPerson();
		l1.forEach((p) -> {
			if (musictandgender.test(p.getGender(), p.getHobbies())) {
				System.out.println(p.getName() + "  " + p.getHobbies());
			}

		});

	}

}
