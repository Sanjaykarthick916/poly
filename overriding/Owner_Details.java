package overriding;

public class Owner_Details implements Apple,Oneplus {

	@Override
	public void speed() {
		System.out.println("speed:5g");
		
	}

	@Override
	public void colour() {
		System.out.println("Colour:Black");
		
	}

	@Override
	public void username() {
		System.out.println("Usename:karthi@gmail.com");
		
	}

	@Override
	public void passwor() {
		System.out.println("Passwor:$$$$$$");
		
	}

	@Override
	public void mobpin() {
	
	}
		
		public static void main(String[] args) {
			Owner_Details o = new Owner_Details();
			o.username();
			o.passwor();
			o.mobpin();
			o.speed();
			o.colour();
		}
		
			
			
			
			
		
		
	}
	


