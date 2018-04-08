package com.radial.service;

import com.radial.Student;
import com.radial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gsingh on 3/27/2018.
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository  studentRepository;

    public List<Student>  getAllStudents(){
        List<Student> students=new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }


    public void  addStudents(Student student){
        studentRepository.save(student);
    }


    public void  updateStudents(String id,Student student){
        studentRepository.save(student);
    }


    public void  deleteStudent(String id){
        studentRepository.delete(id);
    }
}
