package StudentManagment.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;


    public List<Student> getAllStudent(Student student) {
        return  repo.findAll();
    }
}
