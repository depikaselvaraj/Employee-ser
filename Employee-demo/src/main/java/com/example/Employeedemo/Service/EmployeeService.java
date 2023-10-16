package com.example.Employeedemo.Service;

import com.example.Employeedemo.Entity.Employee;
import com.example.Employeedemo.Model.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployee(EmployeeDto employeeDto);

}
