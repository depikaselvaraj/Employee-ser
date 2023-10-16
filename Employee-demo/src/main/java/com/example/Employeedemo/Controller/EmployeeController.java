package com.example.Employeedemo.Controller;

import com.example.Employeedemo.Entity.Employee;
import com.example.Employeedemo.Model.EmployeeDto;
import com.example.Employeedemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmp")
    public List<Employee> getEmp(@RequestBody EmployeeDto employeeDto){
        return employeeService.getEmployee(employeeDto);
    }


}
