package com.radial.controller;

import com.radial.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class WelcomeController {
   /* @RequestMapping(value="welcome")
    public String welcome () {
        return "Welcome to SpringBootApplication";
    }*/
@ApiOperation(value = "View the    welcme page ", response = Iterable.class )
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successfully retrieved list"),
        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
}
)
    @RequestMapping("/welcome")
    public ModelAndView firstPage() {
        return new ModelAndView("welcome");
    }

    @ApiOperation(value = "View login page", response = Iterable.class )
    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @ApiOperation(value = "View lgut page", response = Iterable.class )
    @RequestMapping("/logout")
    public ModelAndView logout() {
        return new ModelAndView("logout");
    }

    @ApiOperation(value = "View emplyee", response = Iterable.class )
    @RequestMapping(value = "/employee")
    public Employee getEmployee() {
        Employee employee = new Employee();

        employee.setFirstName("Garima");
        employee.setLastName("Singh");
        return employee;
    }
}
