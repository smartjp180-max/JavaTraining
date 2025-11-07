package Marker_Interface;

public class ObjectCloningCls {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		//System.out.println("JP....");
		
		Department d = new Department(1, "EEE");
		
		Students1 s = new Students1(100, "Ashok", d);
		
		Students1 s1 = (Students1) s.clone();
		
		d.name ="IT";
		
		//d.print();
		s.print();
		s1.print();

	}

}
