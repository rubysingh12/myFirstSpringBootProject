package com.radial.repository;

import com.radial.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gsingh on 3/27/2018.
 */
public interface StudentRepository  extends CrudRepository<Student,String>{
}
