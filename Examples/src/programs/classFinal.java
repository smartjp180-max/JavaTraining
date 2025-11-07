package programs;

public class classFinal implements interface1, interface2 {

	@Override
	public void test() {
		System.out.println("Interface1Implement");
		}
	
public static void main(String[] args) {
	classFinal c = new classFinal();
	c.test();
}
}
