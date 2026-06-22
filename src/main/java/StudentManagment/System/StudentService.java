package StudentManagment.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;


    public List<Student> getAllStudent(Student student) {
        return  repo.findAll();
    }

    public Student addStudent(Student student){
        return  repo.save(student);
    }

    public Student updateStudent(Student student) {
        return  repo.save(student);
    }

    public void deleteStudent(int studId) {
        repo.deleteById(studId);
    }
}
