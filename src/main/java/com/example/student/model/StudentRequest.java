package com.example.student.model;
import java.util.Objects;

public class StudentRequest {
    private String name;
    private Integer mobileno;
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
        StudentRequest that = (StudentRequest) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(mobileno, that.mobileno);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, mobileno);
    }
}


