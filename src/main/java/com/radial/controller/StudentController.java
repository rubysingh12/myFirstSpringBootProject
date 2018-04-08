package com.radial.controller;

import com.radial.Student;
import com.radial.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/studentDetails")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/students",method = RequestMethod.GET)
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }

    @RequestMapping(value="/students",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void  addStudents(Student student){
        studentService.addStudents(student);
    }

    @RequestMapping(value="/students",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void  updateStudents(String id,Student student){
        studentService.updateStudents(id,student);
    }

    @RequestMapping(value="/students/{id}",method = RequestMethod.DELETE)
    public void  deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
    }
}
