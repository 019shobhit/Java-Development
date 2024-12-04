package myPackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentServices implements StudentInterface {
	
	List<Student> list=null;
	public StudentServices() {
		list = new ArrayList<>();
		list.add(new Student(1,"Shobhit","MCA"));
		list.add(new Student(2,"Prafful","MCA"));
		list.add(new Student(3,"Rohit","B.Tech"));

	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Student addStudent(Student newStudent) {
		list.add(newStudent);
		return newStudent;
	}

	@Override
	public Student editStudent(Student newStudent) {
		for(Student s : list) {
			if(s.getId() == newStudent.getId()) {
				s.setCourse(newStudent.getCourse());
				s.setName(newStudent.getName());
			}
		}
		
		return newStudent;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
