package com.poly.lab3_java6.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @NotBlank(message = "Email is required")
    @Email(message = "Wrong partern")
    private String email;
    @NotBlank(message = "Name is required")
    private String name;
    @NotNull(message = "Marks is required")
    private Double marks;
    @NotNull(message = "Gender is required")
    private Boolean gender;
    @NotBlank(message = "Country is required")
    private String country;
}
