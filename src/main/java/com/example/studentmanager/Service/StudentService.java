package com.example.studentmanager.Service;

import com.example.studentmanager.Enitity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findALL();
    Optional<Student> findById(int id);
    Student save(Student thestudent);
    void deleteById(int id);

}
