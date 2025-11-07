package programs;

import java.lang.reflect.Constructor;

public class Hashcodecls {
	int id;
	String name;
	Hashcodecls(int id,String name){
		this.name=name;
		this.id=id;
	}
   @Override
  public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
    
 @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return 21;
    }
    
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	return true;
    }
   
      
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashcodecls a =new Hashcodecls(123,"jp");
		Hashcodecls b =new Hashcodecls(123,"jp");
		System.out.println(a);
	    System.out.println(a.hashCode());
		System.out.println(a.toString());
		System.out.println(a.equals(b));
		 //Iterator a = b.iterator();
	     //while(a.hasnext()){
	    //System.out.println(a.next());
		//for(datatype variable : collection or array){
		//System.out.println(variable);
		
		

	}

}
