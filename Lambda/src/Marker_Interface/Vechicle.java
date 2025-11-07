package Marker_Interface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Vechicle {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		TransportControl tc = new TransportControl(1, "7306");
		
	    //Serialization
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\sanja\\eclipse-workspace\\Lambda\\src\\Marker_Interface\\Num.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(tc);
//	    
//		//DeSerialization
//		FileInputStream fis = new FileInputStream("C:\\Users\\sanja\\eclipse-workspace\\Lambda\\src\\Marker_Interface\\Num.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		TransportControl tc1 = (TransportControl)ois.readObject();
//		
//		System.out.println(tc1.id + tc1.Num);
//		
//		

		
		//Serializable
		FileOutputStream fos= new FileOutputStream("C:\\Users\\sanja\\eclipse-workspace\\Lambda\\src\\Marker_Interface\\Num1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(tc);
		
		//deserialization
		FileInputStream fis=new FileInputStream("C:\\Users\\sanja\\eclipse-workspace\\Lambda\\src\\Marker_Interface\\Num1.txt");
		ObjectInputStream ios= new ObjectInputStream(fis);
		TransportControl tc2= (TransportControl)ios.readObject();
		
		System.out.println(tc2.id+tc2.Num);
		
		
		
	}

}
