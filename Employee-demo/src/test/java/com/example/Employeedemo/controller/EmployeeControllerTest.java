package com.example.Employeedemo.controller;

import com.example.Employeedemo.Controller.EmployeeController;
import com.example.Employeedemo.Entity.Employee;
import com.example.Employeedemo.Model.EmployeeDto;
import com.example.Employeedemo.Service.EmployeeService;
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
public class EmployeeControllerTest {

   @InjectMocks
    EmployeeController controller;

   @Mock
    EmployeeService service;

   @Test
   public void getEmpTest(){
       EmployeeDto dto = new EmployeeDto("ram",24);
       List<Employee> employeeList = new ArrayList<>();
       Employee emp = new Employee();
       emp.setId(1L);
       emp.setAge(24);
       emp.setFirstName("ram");
       emp.setLastName("kumar");
       emp.setAddress("Kundur");
       emp.setCountry("India");
       employeeList.add(emp);
       Mockito.when(service.getEmployee(dto)).thenReturn(employeeList);
       List<Employee> res = controller.getEmp(dto);
       Assert.assertNotNull(res);
   }
}
