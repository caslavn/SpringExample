package rs.caslav.SpringExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rs.caslav.SpringExample.repository.StudentRepository;
import rs.caslav.SpringExample.service.StudentService;
import rs.caslav.SpringExample.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/list")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepository studentRepository;

    /*public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("list/students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> studentList = studentService.findStudents();
        return ResponseEntity.ok(studentList);
    }*/

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> allStudentslist = studentRepository.findAll();
        return allStudentslist;
    }

    @PostMapping
    public String create(@RequestBody Student student){
        studentRepository.save(student);
        return "Student is created";
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        //studentRepository.findById(id);

    }

}
