package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Student;
import spring_boot_student_system.student_system.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public void save(Student s) {
        repo.save(s);
    }

    public List<Student> getStudents() {
       return repo.findAll();
    }

}
