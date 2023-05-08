package Overloading;

public class Laptop {
	public void computers() {
		System.out.println("Specification of computers");
	}
		public void computers(int a) {
			System.out.println("Acer" + a);
		}
		public void computers(String b) {
			System.out.println("Hp" + b);
		}
		public void computers(String c, char d) {
			System.out.println(c+d);
		}
		public static void main(String[] args) {
			Laptop lap = new Laptop();
			lap.computers();
			lap.computers(10);
			lap.computers("version");
			lap.computers("Gen",'A');
		}
			
					
				
			
		
	}


