package Marker_Interface;

public class Students1 implements Cloneable{
	
	int id;
	String name;
	Department dept;
	
	public Students1(int id, String name, Department dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	void print() {
		System.out.println("Student Id :" + id);
		System.out.println("Student name :"+ name);
		System.out.println(dept.name); 
		dept.print();
	}
	
	 protected Object clone() throws CloneNotSupportedException{
		Students1 s1 = (Students1) super.clone();
		//System.out.println(s1);
		dept = (Department) s1.dept.clone();//Deep Copying the Department By Separating from the Memory Reference
		return s1;
	 }

}

