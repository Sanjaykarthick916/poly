package Collection_sub;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_map {

	public static void main (String[]args) {
		Map<String,String> k = new java.util.TreeMap<String,String>();
		k.put("name:", "karthick");
	    k.put("location:", "trichy");
		k.put("graduation:", "engg");
		k.put("kavery", "kavery");
		System.out.println(k);
		
		boolean a = k.containsValue("location");
		System.out.println(a);
		
		Set<Entry<String,String>> b = k.entrySet();
		System.out.println(b);
		
		int c=k.size();
		System.out.println(c);
		
	boolean d =	k.containsKey("name");
	System.out.println(d);
	
	String e =k.get("kavery");
	System.out.println(e);
	
	Set<String> f= k.keySet();
	System.out.println(f);
	
	
	
	
	
		
		
		
	}

}
