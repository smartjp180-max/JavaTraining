package Marker_Interface;

public class Department implements Cloneable
{
	int id;
	String name;
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void print() {
		System.out.println("Department Id :" + id);
		System.out.println("Department name :"+ name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
