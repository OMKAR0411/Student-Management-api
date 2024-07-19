package com.example.studentmanager.Service;

import com.example.studentmanager.DAO.StudentRepository;
import com.example.studentmanager.Enitity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository1){
        studentRepository =studentRepository1;
    }

    @Override
    public List<Student> findALL() {
       return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student save(Student thestudent) {
        return studentRepository.save(thestudent);
    }


    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
