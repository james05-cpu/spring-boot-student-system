package spring_boot_student_system.student_system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Student;
import service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;


    @RequestMapping("getStudents")
    public List<Student> getStudents()
    {
        return service.getStudents();
    }

}