package practiseInterface;

import java.util.Arrays;
import java.util.List;

public class Repository {

	public static  List<person> getAllPerson() {
		
		person p1 = new person("Hema", 160, 10000, "Female", 1, Arrays.asList("cricket", "cooking", "music"));
		person p2 = new person("Dharani", 158, 15000, "Female", 2, Arrays.asList("drawing", "dancing"));
		person p3 = new person("venkat", 170, 20000, "Male", 2, Arrays.asList("singing", "swimming"));
		person p4 = new person("Jp", 165, 30000, "Male", 10, Arrays.asList("music", "cooking", "badminton"));
		return Arrays.asList(p1, p2, p3, p4);
	}

}
