package studentmanagement;

import java.util.Objects;

public class Student {
	private String name;
	private int roll_no;
	
	public Student(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(roll_no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		boolean duplicate = roll_no == other.roll_no;
		System.out.println(other.roll_no+" id already present.");
		return duplicate;
	}
	
}
