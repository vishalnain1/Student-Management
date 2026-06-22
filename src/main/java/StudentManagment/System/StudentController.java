package StudentManagment.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;


    @GetMapping("/student")
    public List<Student> getStudents(Student student){
        return  service.getAllStudent(student);
    }


    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return  service.addStudent(student);

    }

    @PutMapping("/student")
    public  Student updateStudent(@RequestBody Student student ){
        return  service.updateStudent(student);

    }

    @DeleteMapping("/student/{studId}")
    public  void deleteStudent(@PathVariable int studId){
        service.deleteStudent(studId);
    }

}
