package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serializablecls {
	
	
	public static void main(String[] args) throws Exception{
		serializable ss=new serializable(25,"dharani");
		
		//serialization
		File f =new File("C:\\Users\\Suriya\\Examples\\src\\practice\\series.txt");
		FileOutputStream fos= new FileOutputStream(f);
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		obj.writeObject(ss);
		
		//deserialization
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois= new ObjectInputStream(fis);
		serializable ss1 = (serializable)ois.readObject();
		System.out.println(ss1.i+""+ss1.name);
	}
	

}
