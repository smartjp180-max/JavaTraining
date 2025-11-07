package Marker_Interface;

import java.io.Serializable;

public class TransportControl implements Serializable{
	int id;
	String Num;
	
	public TransportControl(int id,	String Num) {
		this.id = id;
		this.Num = Num;
	}

}
