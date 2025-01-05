package myPackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {
	@Autowired
	StudentInterface obj;
	
	@GetMapping("/student")
	public List<Student> fetchall(){
		return obj.getStudent();
	}
	
	@PostMapping("/student")
	public Student savedetail(@RequestBody Student newStudent) {
		return obj.addStudent(newStudent);
	}
	
}


