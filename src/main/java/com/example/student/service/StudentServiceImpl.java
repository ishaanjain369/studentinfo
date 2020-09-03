package com.example.student.service;

import com.example.student.model.Student;
import com.example.student.model.StudentRequest;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentRepository studentRepository;
    public Student createStudent(StudentRequest request){
        Student st = new Student();
        st.setName(request.getName());
        st.setMobileno(request.getMobileno());
        return studentRepository.save(st);

    }
    public Student getStudent(Long rollno) {
        Optional<Student> st = studentRepository.findById(rollno);
        //try{
            return st.get();
        //}
       // catch (Exception e){
          //  return null;
        //}
    }
    public Student update(Student st) {
        return studentRepository.save(st);
    }
    public void del(Long rollno){
        Optional<Student> st =studentRepository.findById(rollno);
        studentRepository.delete(st.get());
    }
}
