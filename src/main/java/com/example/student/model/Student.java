package com.example.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rollno;
    private String name;
    private Integer mobileno;
    public Long getRollno() {
        return rollno;
    }
    public void setRollno(Long rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getMobileno() {
        return mobileno;
    }
    public void setMobileno(Integer mobileno) {
        this.mobileno = mobileno;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollno, student.rollno) &&
                Objects.equals(name, student.name) &&
                Objects.equals(mobileno, student.mobileno);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rollno, name, mobileno);
    }
}

