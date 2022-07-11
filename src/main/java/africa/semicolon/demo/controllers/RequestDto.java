package africa.semicolon.demo.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    private String name;
    private int age;
    private String email;
    private double schoolFees;
    private double amountPaid;
}
