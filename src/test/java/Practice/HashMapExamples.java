package Practice;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap m1= new TreeMap();
		m1.put(1, "A");
		m1.put("A", "B");
		System.out.println(m1);
		
		
		TreeMap m2= new TreeMap();
		m2.put(1, "A");
		m2.put("A", "B");
		System.out.println(m1);
		
		 m2.entrySet().iterator();

	}

}
