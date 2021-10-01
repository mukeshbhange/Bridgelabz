package studentmanagement;
import java.util.*;

public class SController {
	public static void main(String args[]) {
		StudentView std_view = new StudentView();
		StudentManagement sm = StudentManagement.getInstance();
		
		boolean flag = true;
		do {
			int choice = std_view.getUserInput();
			switch(choice) {
			case 1:
				Student student = std_view.stdInfo();
				sm.add(student);
				//std_view.addedStudent(student);
				break;
			case 2:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Student Name to Delete");
				String name = sc.nextLine();
				sm.delete(name);
				break;
			case 3:
				sm.getAllStudent();
				break;
			case 4:
				System.exit(0);
			}
		}while(flag);
	}
}
