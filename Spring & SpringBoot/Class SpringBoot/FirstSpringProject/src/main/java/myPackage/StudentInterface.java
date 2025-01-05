package myPackage;

import java.util.List;

public interface StudentInterface {
	public List<Student> getStudent();
	public Student getStudent(int id);
	public Student addStudent(Student newStudent);
	public Student editStudent(Student newStudent);
	
}
