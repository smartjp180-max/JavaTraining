package java8;

class lambdaDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebPage w1 = (String value) -> System.out.println("hii"+value); 
		w1.header("google");
		
		WebPage w2 = (value) ->  System.out.println("Hello"+value);
		w2.header("hema");
	}

}
