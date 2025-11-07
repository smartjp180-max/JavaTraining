package Marker_Interface;

public class Mainclonestddept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Students s = new Students(1, "JP"); 
		
		Deparment d = new Deparment(1,"JP","B.Pharm");
		
		Students s1 = (Students)s.clone();
		
		System.out.println(s1.Department+" "+ s1.Id +" ");
		System.out.println(s1.ID+ " "+s1.Name);
	}

}
