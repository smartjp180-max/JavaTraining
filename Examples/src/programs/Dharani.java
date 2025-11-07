package programs;

public class Dharani extends Jaya{
	int a =10;
    String s ="hello";
    
    public void jp() {
    	System.out.println("hello");
    }
    public void senior() {
    	int b =10;
    	int c =20;
    	int e = b+c;
    	System.out.println("the sum is"+e);
    	
    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dharani d = new Dharani();// classname object reference = new classname();
		d.jp();
		d.senior();

	}

}
