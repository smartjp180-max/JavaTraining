package java_basic;



public class Student implements Cloneable{
	
	int id;
	String name;
	Department dept;
	public Student(int id, String name, Department dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	void print() {
		System.out.println("Student Id :" + id);
		System.out.println("Student name :"+ name);
		//System.out.println(dept.name);
		dept.print();
	}
	
	 protected Object clone() throws CloneNotSupportedException{
		Student s1 = (Student) super.clone();
		//System.out.println(s1);
		dept = (Department) s1.dept.clone();
		return s1;
	 }

}
