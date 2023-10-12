package com.example.Employeedemo.Service;

import com.example.Employeedemo.Entity.Employee;
import com.example.Employeedemo.Model.EmployeeDto;
import com.example.Employeedemo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee(EmployeeDto employeeDto) {
        return employeeRepository.findByFirstNameAndAge(employeeDto.getFirstName(),employeeDto.getAge());
    }
}
