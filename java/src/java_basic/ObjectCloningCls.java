package java_basic;

public class ObjectCloningCls {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		System.out.println("JP....");
		
		Department d = new Department(1, "EEE");
		
		Student s = new Student(100, "Ashok", d);
		
		Student s1 = (Student) s.clone();
		
		d.name ="CSC";
		
		//d.print();
		s.print();
		s1.print();

	}

}
