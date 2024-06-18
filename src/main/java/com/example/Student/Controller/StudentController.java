package com.example.Student.Controller;

import com.example.Student.Entity.Student;
import com.example.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/createstudent")
    public Student createStudent(Student student){
        return studentService.createStudent(student);
    }

    @PostMapping("/createmultiplestudents")
    public List<Student> createMultipleStudents(List<Student> students){
        return studentService.createMultipleStudents(students);
    }

    @GetMapping("/getstudent")
    public Optional<Student> getStudentById(Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/getmultiplestudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/updatestudent")
    public Student updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deletestudent")
    String deleteStudent(Long id){
        return studentService.deleteStudent(id);
    }
}

