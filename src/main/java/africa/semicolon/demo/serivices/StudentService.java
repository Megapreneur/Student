package africa.semicolon.demo.serivices;

import africa.semicolon.demo.data.models.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    void addStudent(String name, int age, String email, double schoolFees, double amountPaid );

    List<Student> findStudentByName(String name);
    Optional<Student> findById(long id);
    Student findByEmail(String email);
    void delete(Student student);
    Student update(Student student);
}
