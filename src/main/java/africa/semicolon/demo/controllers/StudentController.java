package africa.semicolon.demo.controllers;

import africa.semicolon.demo.data.models.Student;
import africa.semicolon.demo.serivices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public String addStudent(@RequestBody RequestDto requestDto){
        studentService.addStudent(requestDto.getName(), requestDto.getAge(), requestDto.getEmail(), requestDto.getSchoolFees(), requestDto.getAmountPaid());
        return "Added successfully";
    }

}
