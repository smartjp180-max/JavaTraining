package oops_concept;

public class method_overloading extends m_overriding{
public void method1()
{
	System.out.println("This is method overloading");
}
public void method1(int i)
{
	System.out.println("the value of i is: "+i);
}
public void method1(String a, int i)
{
	System.out.println("the value of a and i is: "+ a + i);
}
public void method2()
{
	System.out.println("done");
}
public static void main(String[] args)
{
	method_overloading m=new method_overloading();
	m.method1();
	m.method1(2);
	m.method1("Hi ", 15);
	m.method2();
}
}
