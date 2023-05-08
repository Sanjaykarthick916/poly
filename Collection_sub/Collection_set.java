package Collection_sub;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_set {
	public static void main(String[] args) {
	Set <Object> m = new HashSet <Object>();
	m.add(1000);
	m.add(2000);
	m.add("********");
	m.add(3000);
	System.out.println(m);
	
	int size = m.size();
	System.out.println(size);
	
	Set <Object> n = new LinkedHashSet<Object>();
    n.add(100);
    n.add(200);
    n.addAll(m);
    System.out.println(n);
    
    Object contains = n.containsAll(m);
    System.out.println(m);
    
    Object contains1 = m.contains(m);
    System.out.println(m);
	
	Object retainAll = m.retainAll(m);
	System.out.println(n);
	
	Object removeAll = n.removeAll(n);
	System.out.println(n);
	
	Object remove= n.remove(2000);
	System.out.println(m);

}}
