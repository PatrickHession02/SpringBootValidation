package ie.atu.springbootvalidation;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must not be between 2 and 50 characters")
    private String name;

    @NotBlank(message ="Title cannot be blank")
    private String title;

    @NotEmpty(message = "EmplyeeID cannot be Empty")
    private int employeeId;

    @NotEmpty(message="Age cannot be empty")
    private int age;

    @Email(message = "Invalid Email Address")
    private String email;

    @NotBlank(message ="Position cannot be blank")
    private String position;

    @NotBlank(message ="Department cannot be blank")
    private String department;
}
