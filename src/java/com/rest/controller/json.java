/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.controller;

import com.rest.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping("home")
public class json {
    Employee employee = new Employee();
    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
    
  @RequestMapping(value = "/{name}", method = RequestMethod.GET,produces = "application/json")
    public  Employee getEmployeeInJSON(@PathVariable String name) {
 
   	 employee.setName(name);
   	 employee.setEmail("employee1@genuitec.com");
 
   	 return employee;
 
    }
    
}
