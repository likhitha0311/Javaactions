package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ArrayListMethods {

	public static void main(String[] args) 
	
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(2);
		a1.add(10);
		System.out.println(a1);
		
		HashSet<Integer> h1= new HashSet<Integer>(a1);
		
		System.out.println(h1);
		
     ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		a2.add(1);
		a2.add(2);
		a2.add(5);
		a2.add(6);
		
		System.out.println(a2);
		
		//a1.addAll(a2);
		//System.out.println(a1);
		
		//a2.retainAll(a1);
		//System.out.println(a2);
		
		a1.removeAll(a2);
		System.out.println(a1);
		
		HashSet h =new HashSet();
		h.add("Ram");
		h.add(1);
		h.add(67.89);
		h.add("Roopesh");
		h.add(null);
		System.out.println(h);
		
		ArrayList<Integer> a6 = new ArrayList<Integer>(h);
		System.out.println(a6);
		
		TreeSet<Integer> s= new TreeSet<Integer>();
		
		s.add(20);
		s.add(45);
		s.add(12);
		s.add(23);
		System.out.println(s);
		
		
ArrayList a5 = new ArrayList();
		
		a5.add(13);
		a5.add(22.77);
		a5.add(33.99);
		a5.add(4);
		a5.add(2);
		a5.add(10);
		System.out.println(a5);
	}
	


}
