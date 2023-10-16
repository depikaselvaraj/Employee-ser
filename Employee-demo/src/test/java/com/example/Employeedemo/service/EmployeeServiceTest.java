package com.example.Employeedemo.service;

import com.example.Employeedemo.Entity.Employee;
import com.example.Employeedemo.Model.EmployeeDto;
import com.example.Employeedemo.Repository.EmployeeRepository;
import com.example.Employeedemo.Service.EmployeeService;
import com.example.Employeedemo.Service.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    EmployeeServiceImpl service;

    @Mock
    private EmployeeRepository fiveGRepository;


    @Test
    public void getEmployeeTest(){
        List<Employee> employeeList = new ArrayList<>();
        List<Employee> res = new ArrayList<>();
        Employee emp = new Employee();
        emp.setId(1L);
        emp.setAge(24);
        emp.setFirstName("ram");
        emp.setLastName("kumar");
        emp.setAddress("Kundur");
        emp.setCountry("India");
        employeeList.add(emp);
        EmployeeDto dto = new EmployeeDto("ram",24);
        Mockito.when(fiveGRepository.findAll()).thenReturn(employeeList);
        res = service.getEmployee(dto);
        Assert.assertNotNull(res);

    }

}
