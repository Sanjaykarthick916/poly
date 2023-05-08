package String_func;

public class Mute_immute {
	public static void main(String[] args) {
		String k = "sanjay";
		String k1 = "karthick";
		
		System.out.println(System.identityHashCode(k));
		System.out.println(System.identityHashCode(k1));
		System.out.println(System.identityHashCode(k=k+k1)); //mutable
		
		System.out.println("##########");
		StringBuffer x = new StringBuffer("HELLO");
		System.out.println(System.identityHashCode(x));
		
		StringBuffer y = new StringBuffer("HELLO");
		System.out.println(System.identityHashCode(y));
		
		
		System.out.println(System.identityHashCode(x.append(y)));
		
	}
	
	

}
