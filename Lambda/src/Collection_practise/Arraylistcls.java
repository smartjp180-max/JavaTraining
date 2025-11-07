package Collection_practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistcls {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(8);
		al.add(1);
		al.add(10);
		al.add(6);
		al.add(3);
		al.add(2);
		al.add(7);
		al.add(4);
		al.add(1);//Duplicates
		al.add(5);
		al.add(9);
		System.out.println(al);
		//al.add(1, "jp");
		//al.add(0, null); key-value pair
		al.get(1);
		System.out.println(al.get(1));
		al.size();
		System.out.println(al.size());
		al.isEmpty();	
		System.out.println(al.isEmpty());
		//al.set(1, "jp"); Replaces an element at a specific index
		al.remove(1);  //Removes element at index
		System.out.println(al.remove(1));
		al.remove(al);
		System.out.println(al.remove(al));
		al.containsAll(al); //Checks if an element exists
		System.out.println(al.containsAll(al));
		al.indexOf(al); //Returns first index of element
		System.out.println(al.indexOf(al));
		al.lastIndexOf(al); //Returns last index of element
		System.out.println(al.lastIndexOf(al));
		al.toArray();  //Converts list to array
		System.out.println(al.toArray());
		al.clone();    //clone
		System.out.println(al.clone());
		al.iterator();  //Returns an iterator for looping
		System.out.println(al.iterator());
		//al.forEach(al);
		ArrayList<Integer> al1 = new ArrayList<>();
		al.equals(al);  //Checks if two lists are equal
		System.out.println(al.equals(al1));
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);                                                    //doubt
		System.out.println(al);
		boolean t=al.addAll(al1);
		System.out.println(t); 
		al.removeAll(al1);  //Removes all matching elements
		System.out.println(al);
		al.retainAll(al1);  //Keeps only matching elements
		System.out.println(al1);
		Iterator it = al.iterator();
		it.hasNext();
		it.next();
		System.out.println(it );
		System.out.println(al);
		al1.toArray();
		System.out.println(al1);
		
		
		
		

	}

}
