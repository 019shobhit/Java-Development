package myPackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServices implements StudentInterface {
	@Autowired
	StudentDAO sd;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return sd.findAll();
	}

	@Override
	public Student addStudent(Student newStudent) {
		// TODO Auto-generated method stub
		sd.save(newStudent);
		return newStudent;
	}
}
