package programs;

public class Reversestring {
		    public static void main(String[] args) {
		        String str = "Hello World";
		        char str2 =' ';
		        for (int i = str.length(); i >= 0; i--) {
		            str2 = str.charAt(i);
		        }
		        System.out.println(str2);
		    
	}

}
