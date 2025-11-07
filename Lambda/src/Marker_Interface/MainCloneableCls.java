package Marker_Interface;

public class MainCloneableCls {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ImplCloneableCls icc = new ImplCloneableCls(100);
		
		ImplCloneableCls icc1 =(ImplCloneableCls)icc.clone();
		
		System.out.println(icc1.i);

	}
}
