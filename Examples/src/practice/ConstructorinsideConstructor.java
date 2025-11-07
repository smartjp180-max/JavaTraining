package practice;

import java.lang.reflect.Constructor;

public class ConstructorinsideConstructor {
	
	int id;
	String name;
	
//	public ConstructorinsideConstructor(int id,String name) {
//		this();
//		this.id=id;
//		this.name=name;
//	}
	
	
	public ConstructorinsideConstructor() {
		this("Hello");
	}
	
	public ConstructorinsideConstructor(String s) {
		System.out.println(s);
	}
	
	
//	public ConstructorinsideConstructor(int id,String name,String contact) {
//		this.id=id;
//		this.name=name;
//	}
	
	
	
	

	public static void main(String[] args) {
		
		ConstructorinsideConstructor cic = new ConstructorinsideConstructor();
		
		
		
	}

}
