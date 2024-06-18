package com.example.Student.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Student_details")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "email")
    private String email;

    public long getId() {
        return id;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getQualification(){
        return qualification;
    }

    public String getEmail(){
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
