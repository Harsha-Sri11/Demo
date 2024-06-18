package com.example.Student.Service;

import com.example.Student.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StudentService {


     Student createStudent(Student student);
     List<Student> createMultipleStudents(List<Student> students);
     Optional<Student>  getStudentById(Long id);
     List<Student> getAllStudents();
     Student updateStudent(Student student);
     String deleteStudent(Long id);
}
