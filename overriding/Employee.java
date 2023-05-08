package overriding;

public class Employee extends Email {

	@Override
	public void password() {
		System.out.println("Password:######");
		
		
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.usename();
		e.password();
		
		
	}
	

}
