package practice;

public class Method {
		 
		// public,private,protected,default
		//returntype -- it returns a value -- and mentions its type (datatypes , void-null-returns no value)
		//syntax for method  <accessspecifier>  <returntype> <methodname> ( parameter/arguments ) { }
		
		public void addition(int x, int y) {
			//body of the method
			int c = x+y;
			System.out.println(c);
		}
		
		public int multiply(int x, int y) {
			//local variable is nothing but a variable declared inside a method and accessed only with in a method.
			
			System.out.println(y*x);
			return x*y ;
			
		}
		
		
		
		public static void main(String[] args) {
			//what is a class?
			//syntax 
			//<access specifier> <class> <class name> { }
			//collection of methods and objects,datatypes,variables.etc
			//it is a template or structure 
			//method/function-- defines or performs an action -- 
			//why method?
			
			Method obj = new Method();//object created//memory created when object is created
			int n =50;
			int nn =60;
			
			obj.addition(n, nn);
			obj.addition(500, 160);
			
			int var =  obj.multiply(10, 10); 
			//System.out.println();
			int mm = 200;
			obj.addition(mm, var);
			

			
			
			
			
			
			int i =3;
			int n1 = 4;
			 
			int c = i+n;
			System.out.println(c);
			int x = 2;
			int y =5;
			int z = x+y;
			System.out.println(z);
			
			
			

		}

	}

