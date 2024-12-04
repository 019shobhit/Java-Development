package myPackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {
	@Autowired
	StudentInterface sc;
	@GetMapping("Studensdetails")
	public List<Student> getStudentList(){
		return sc.getStudent();
	}
	@GetMapping("Studentsdetails/{sid}")
    public Student getonestudentdetail(@PathVariable int sid)
    {
    	return sc.getStudent(sid);
    }
	
	@PostMapping("Studentsdetails")
    public Student insertnewstudent(@RequestBody Student newStudent) {
    	return sc.addStudent(newStudent);
    }
	
	@PutMapping("Studentsdetails/{sid}")
    public Student updateStudent(@PathVariable int sid, @RequestBody Student updatedStudent) {
        Student existingStudent = sc.getStudent(sid);
        if (existingStudent != null) {
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setCourse(updatedStudent.getCourse());
        }
        return existingStudent;
    }
	
}


