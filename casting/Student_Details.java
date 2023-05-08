package casting;

import java.util.Scanner;

public class Student_Details {
	Scanner a = new Scanner(System.in);
	public void StudentName() {
		System.out .println("Enter the name");
		String b = a.nextLine();
		System.out.println(b);
	}
	public void Section() {
		System.out .println("Enter the section");
		String c = a.nextLine();
		System.out.println(c);
	}
	public void Rank() {
		System.out .println("Enter the rank");
		String d = a.nextLine();
		System.out.println(d);		
		
	}
	public static void main(String[] args) {
		Student_Details s = new Student_Details();
		s.StudentName();
		s.Section();
		s.Rank();
		
	
	
	}
	

}
