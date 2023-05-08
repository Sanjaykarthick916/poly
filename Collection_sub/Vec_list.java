package Collection_sub;


import java.util.List;
import java.util.Vector;

public class Vec_list {
	public static void main(String[] args) {
		List<Object> m = new Vector<Object>();
		m.add("10");
		m.add(20);
		m.add(2,"java");
		m.add(30);
		System.out.println(m);
		
		int x = m.size();
		System.out.println(x);
		
		int y = m.indexOf(2);
		System.out.println(y);
		
		Object u = m.get(2);
		System.out.println(u);
		
		m.addAll(m);
		System.out.println(m);
		
		m.retainAll(m);
		System.out.println(m);
		
		m.clear();
		System.out.println(m);
		
		m.removeAll(m);
		System.out.println(m);

}}
