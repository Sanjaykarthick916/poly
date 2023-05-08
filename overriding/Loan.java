package overriding;

import Overloading.Laptop;

public class Loan {
	public static class Desktop extends Laptop {
		 public void limit() {
			 System.out.println("Rs.30000");
		 }
			 public void status(String b) {
				 System.out.println(b);
			 }
			 public static void main(String[] args) {
				 Loan l = new Loan();
				 l.limit();
				 l.status("Completed");
				 
				 
			 }
		 }

	public void limit() {
		System.out.println("RS.30000");
		
		
	}

	public void status(String string) {
		System.out.println("completed");
		
		
	}

		
		
	}
		
	


