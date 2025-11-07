package Marker_Interface;

public class Maincusint 
{

	public static void main(String[] args) 
	{
		clscusint cci = new clscusint();
		
		if (cci instanceof Jp) 
		{
			System.out.println("Object is Allowed,Class Implements the Custom Marker Interface JP");
			cci.print();
		}
		else 
		{
			System.out.println("Object Not Allowed");
		}
	}
}
