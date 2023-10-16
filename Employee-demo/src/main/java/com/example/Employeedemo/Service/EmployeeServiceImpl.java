package com.example.Employeedemo.Service;

import com.example.Employeedemo.Entity.Employee;
import com.example.Employeedemo.Model.EmployeeDto;
import com.example.Employeedemo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee(EmployeeDto employeeDto) {
        List<Employee> emp = new ArrayList<>();
        List<Employee> employeeList = employeeRepository.findAll();
        for(Employee employee : employeeList)
            if(employee.getAge() == employeeDto.getAge() && employee.getFirstName().equals(employeeDto.getFirstName())){
                emp.add(employee);
            }
        return emp;
    }


}
