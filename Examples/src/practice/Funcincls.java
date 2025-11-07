package practice;

public class Funcincls implements Funcinterface {
	
	
	public static void main(String[] args) {
		Funcinterface f=(x,y)->System.out.println(x+y);
		f.add(100,100);

		Funcinterface.mul();// we are calling the static method by using class name of which the method present
		Funcincls fis= new Funcincls();
		fis.sub();//therefore default method can be called by creating object of the subclass or child class
		
		
	}

	@Override
	public void add(int i, int y)
	{
		// TODO Auto-generated method stub
		
	}
	
	


	}


