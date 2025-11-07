package Functional_Interface;

@FunctionalInterface
public interface FunIF {

	//Functional Interface->Single Abstract Method(SAM)
	
	public abstract void print();
	
	//public int add();
	
	//public void Tvk(); // Need to Implement for all class extended 
	
	default void m2() {
		System.out.println("raakesh");
	}
	
//	default void m22() {
//		System.out.println("Venkatesh");
//	}
	
	default void m22() {
		System.out.println("Venkatesh");
	}
	
	public default  void Dharani() {
		System.out.println("Java Queen");
	}
	public static void main(String[] args) {
		System.out.println("jp");
		
		FunIF fh=() ->System.out.println("jp");
		fh.print();
		//(FunIF::print);
		
		
		
		
		
	}
}
