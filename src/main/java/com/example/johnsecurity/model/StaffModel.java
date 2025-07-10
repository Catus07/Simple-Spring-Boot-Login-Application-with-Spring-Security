package com.example.johnsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class StaffModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "first name is required")
    private String firstname;

    @NotBlank(message = "last name is required")
    private String lastname;

    @NotBlank(message = "username is required")
    @Size(min = 3, max = 20, message = "username must be 3-20 character")
    private String username;

    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d).{8,}$", message = "password must be at least 8 character")
    private String password;

    @NotBlank(message = "gender is required")
    private String gender;

    @NotNull(message = "age is required")
    private int age;


}
