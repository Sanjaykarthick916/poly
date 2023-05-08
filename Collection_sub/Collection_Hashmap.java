package Collection_sub;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Collection_Hashmap {
	public static void main (String[]args) {
		Map<Integer,String> m = new java.util.HashMap<Integer,String>();
		m.put(1, "500");
	    m.put(2, "sanjay");
		m.put(3, "karthick");
		m.put(4, "1000");
		System.out.println(m);
		
		boolean a = m.containsValue("sanjay");
		System.out.println(a);
		
		Set<Entry<Integer,String>> b = m.entrySet();
		System.out.println(b);
		
		int c=m.size();
		System.out.println(c);
		
	boolean d =	m.containsKey(1);
	System.out.println(d);
	
	System.out.println(m.get(2));
	
	Set<Integer> f= m.keySet();
	System.out.println(f);

}}
