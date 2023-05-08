package casting;

public class Heavy  extends Vechicle {
	public void company() {
		System.out.println("Ashok Leylond");
	}
	public void insurace() {
		System.out.println("sundaram");
	
	}
	public static void main(String[] args) {
		Vechicle v = new Heavy();
		v.type();
		v.Speed();
		v.EngineType();
		
		
	}

}
