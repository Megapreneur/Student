package africa.semicolon.demo.serivices;

import africa.semicolon.demo.data.models.Student;
import africa.semicolon.demo.data.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(String name,  int age, String email, double schoolFees, double amountPaid) {
        Student student = new Student(name, age, email, schoolFees, amountPaid);
        studentRepository.save(student);
    }

    @Override
    public List<Student> findStudentByName(String name) {

        return studentRepository.findStudentByName(name);
    }

    @Override
    public Optional<Student> findById(long id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);

    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }
}
