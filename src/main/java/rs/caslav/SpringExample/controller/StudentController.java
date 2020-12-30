package rs.caslav.SpringExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.caslav.SpringExample.repository.StudentRepository;
import rs.caslav.SpringExample.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping
    public String create(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student is created";
    }

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }
    
}
