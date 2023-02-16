package com.lhgt.project.restrestaurant.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Entity
@Data
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty(message = "The name is required")
    @Column(nullable = false)
    private String name;
    @NotEmpty(message = "The lastname is required")
    @Column(nullable = false)
    private String lastname;
    private String address;

    @NotEmpty(message = "The phone number is required")
    @Max(12)
    @Column(nullable = false)
    private String phoneNumber;

    @Email
    private String Email;


}
