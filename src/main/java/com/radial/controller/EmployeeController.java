package com.radial.controller;

import com.radial.Employee;
import com.radial.repository.EmployeeRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gsingh on 2/22/2018.
 */
@RestController
public class EmployeeController {
    @Autowired
    public EmployeeRepository employeeRepository;

    @ApiOperation(
            value = "View a list of employees",
            response = Iterable.class
    )
    @RequestMapping(method = RequestMethod.GET,value="/listEmployees")
    public Page<Employee> getAllEmployees(Pageable pageable){
        return employeeRepository.findAll(pageable);
    }

}
