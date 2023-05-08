package overriding;

public class Creditcard {
	public void limit() {
		System.out.println("Rs.100000");
		
	}
	public void status(String b) {
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		Creditcard card = new Creditcard();
		card.limit();
		card.status("processing");
		
		
		
	}

}
