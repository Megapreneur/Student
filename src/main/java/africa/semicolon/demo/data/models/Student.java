package africa.semicolon.demo.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;



@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document("Students")
public class Student {
    @Id
    private long id;
    @NonNull
    private String name;
    private LocalDate dob;
    @NonNull
    @Transient
    private int age;
    @NonNull
    private String email;
    @NonNull
    private double schoolFees;
    @NonNull
    private double amountPaid;

}

