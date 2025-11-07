package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class concurrenthashmapcls{
	 public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<Integer, String>();
		c.put(1,"xyz");
		c.put(2, "abc");
		c.put(5,"pqr");
		//c.put(null,null);
	   System.out.println(c.get(1));
	   c.remove(5);
	   System.out.println(c);
	   c.putIfAbsent(5,"pqr");
	   c.replace(5,"pqr","str");
	   //c.forEachEntry(3,"xyz");iterating using foreach
	   System.out.println(c);
	   for (java.util.Map.Entry<Integer, String> e :c.entrySet()) {
		   System.out.println(e);
		   c.putIfAbsent(3,"mno");   
	   }
	 }
	
}
