package com.example.Student.Service;

import com.example.Student.Entity.Student;
import com.example.Student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> createMultipleStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        Optional<Student> s1 = studentRepository.findById(student.getId());
        if(s1.isPresent()){
            studentRepository.save(student);
        }
        return student;
    }

    public String deleteStudent(Long id){
        studentRepository.deleteById(id);
        return "Student record deleted successfully";
    }
}
