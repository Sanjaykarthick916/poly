package overriding;

public class EmployeeData {
	public EmployeeData () {
		this(98765);
		System.out.println("Employee Info");
			
		}
	public EmployeeData (int enumber) {
		this("Employee name:karthick");
		System.out.println("Employee number:"+enumber);
		
	}
	public EmployeeData(String ename) {
		this('2');
		System.out.println(ename);
	}
	public EmployeeData(char eg) {
		System.out.println("Employee Grade:"+eg);
	}
	public static void main(String[] args) {
		EmployeeData e = new EmployeeData();
	}	
		
}	

		
	
	

