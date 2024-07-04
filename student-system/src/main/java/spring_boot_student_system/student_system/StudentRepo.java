package spring_boot_student_system.student_system;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

// JPQL Query for finding students by name
//    @Query("from Student where name=:name")
//    List<Student> findByName(@Param("name") String name);
}