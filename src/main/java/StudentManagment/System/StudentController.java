package StudentManagment.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;


    @GetMapping("/student")
    public List<Student> getStudents(Student student){
        return  service.getAllStudent(student);
    }

}
