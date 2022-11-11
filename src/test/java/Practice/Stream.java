package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		System.out.println(ar.stream().filter(e-> e%2 ==0).collect(Collectors.toList()));
		
		List<String>items = Arrays.asList("Ananya","Amoolya","Rishi");
		
		items.stream().forEach(e-> {e.toUpperCase(); System.out.println(e);});
		
		items.stream().forEach(e->System.out.println(e.toUpperCase()));
		
		System.out.println(items.stream().map(str->str.length()).collect(Collectors.toList()));
		
		String str="abcd";
		
		HashMap<String , Integer> map1 =new HashMap<String , Integer>();
		
		map1.put("India", 1);
		map1.put("India234", 2);
		map1.put("India345", 3);
		map1.put("India4444", 4);
		System.out.println(map1);
		
	Iterator<Entry<String,Integer>>itr = map1.entrySet().iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next().getKey());
		System.out.println(itr.next().getValue());
	}
		
		
	map1.entrySet().stream().forEach(e->{
		System.out.println(e.getKey());
		System.out.println(e.getValue());
	});
		
		
	}

}
