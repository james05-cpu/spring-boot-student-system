package spring_boot_student_system.student_system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import service.StudentService;

@Configuration
public class StudentSystemConfig {
    @Bean
    public StudentService studentService() {
        return new StudentService(); // or create an instance of your custom StudentService implementation
    }
}