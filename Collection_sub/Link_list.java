package Collection_sub;


import java.util.LinkedList;
import java.util.List;

public class Link_list {
	public static void main(String[] args) {
		List<Object> l = new LinkedList<Object>();
		l.add("1000");
		l.add(2000);
		l.add(2,"java");
		l.add(3000);
		System.out.println(l);
		
		int x = l.size();
		System.out.println(x);
		
		int y = l.indexOf(3);
		System.out.println(l);
		
		Object u = l.get(2);
		System.out.println(u);
		
		l.addAll(l);
		System.out.println(l);
		
		l.retainAll(l);
		System.out.println(l);
		
		l.clear();
		System.out.println(l);
		
		l.removeAll(l);
		System.out.println(l);
		
	

}}
