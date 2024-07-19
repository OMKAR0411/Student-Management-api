package com.example.studentmanager.Controller;

import com.example.studentmanager.DAO.StudentRepository;
import com.example.studentmanager.Enitity.Student;
import com.example.studentmanager.Service.StudentService;
import com.example.studentmanager.StudentmanagerApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService1) {
        this.studentService = studentService1;
    }
    @GetMapping("/students")
    public List<Student> getALL(){
       return studentService.findALL();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> find(@PathVariable int id){
        return studentService.findById(id);
    }
    @PostMapping("/student")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Student addstudent(@RequestBody Student student){
        studentService.save(student);
        return student;
    }

    @PutMapping("/students")
    public Student update(@RequestBody Student thestudent){
        Student student1=studentService.save(thestudent);
        return student1;
    }

    @DeleteMapping("/students/{id}")
    public void Delete(@PathVariable int id){
        studentService.deleteById(id);
    }
}
