package studentmanagement;
import java.util.*;

public class StudentManagement {
	
	private static StudentManagement studentManagementInstance;
	private Set<Student> listOfStudent = new HashSet<Student>();
	
	private StudentManagement() {
		
	}
	
	public static StudentManagement getInstance() {
		if(studentManagementInstance == null) {
			studentManagementInstance = new StudentManagement();
		}
		return studentManagementInstance;
	}

	public void add(Student student) {
		listOfStudent.add(student);
	}

	public void delete(String name) {
		for(Student std:listOfStudent) {
			if(std.getName().equals(name)) {
				listOfStudent.remove(std);
				System.out.println(name+" deleted.");
				//System.out.println(listOfStudent);
				break;
			}
			else {
				System.out.println("Not Found.");
			}
		}
	}
	
	public void getAllStudent(){
		System.out.println(listOfStudent);
	}
}
