package Marker_Interface;

public class Deparment implements Cloneable
{
	
	int Id;
	String Name;
	String Department;
	
	public Deparment(int id, String name, String department) {
		super();
		Id = id;
		Name = name;
		Department = department;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
