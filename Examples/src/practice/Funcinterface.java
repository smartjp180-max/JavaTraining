package practice;
@FunctionalInterface
public interface Funcinterface {

	public void add(int i,int y);// SAM
	
	default void sub() {
		System.out.println("hi world");// we can have  n number of static and default
	}
	public static void mul() {
		System.out.println("welcome");
	}
	
	}
