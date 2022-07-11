package africa.semicolon.demo.data.repositories;

import africa.semicolon.demo.data.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, Long> {
    List<Student> findStudentByName(String name);
    Optional<Student> findStudentById(long id);
    Student findStudentByEmail(String email);


}
