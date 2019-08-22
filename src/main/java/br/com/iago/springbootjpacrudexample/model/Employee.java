package br.com.iago.springbootjpacrudexample.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
