package studentmanagement;
import java.util.Scanner;

public class StudentView {
	Scanner sc = new Scanner(System.in);
	public int getUserInput() {
		System.out.println("1.Add Student \n2.Delete Student by Name \n3.Display All Students\n4.Exit");
		int input =sc.nextInt();
		return input;	
	}
	
	public Student stdInfo() {
		System.out.println("Enter Student Name");
		String name =sc.next();
		System.out.println("Enter Roll Number");
		int roll_no =sc.nextInt();
		return new Student(name,roll_no);
	}
	
	public void addedStudent(Student student) {
		System.out.println(student);
	}
}
