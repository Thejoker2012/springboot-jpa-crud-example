package br.com.iago.springbootjpacrudexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
