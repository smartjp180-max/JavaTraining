package Marker_Interface;

public class ImplCloneableCls implements Cloneable
{
	int i ;
	
	public ImplCloneableCls(int i) {
		this.i=i;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
