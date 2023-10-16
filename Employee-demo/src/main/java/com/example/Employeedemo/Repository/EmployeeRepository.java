package com.example.Employeedemo.Repository;

import com.example.Employeedemo.Entity.Employee;
import com.example.Employeedemo.Model.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
   /* private  List<Employee> employees = new ArrayList<>();

    public void createProducts() {
        employees = List.of(
                new Employee(1, "ram","kumar",24, "HSR Bangalore", "India"),
                new Employee(1, "rajesh","Reddy",40, "HSR Bangalore", "India"),
                new Employee(1, "Anish","kumar",60, "HSR Bangalore", "India")
        );
    }

    public List<Employee> getAllProducts() {
        return employees;
    }

    public List<Employee> getByFirstNameAndAge(String firstName,long age){
        List<Employee> employeeList = new ArrayList<>();
        for(Employee emp : employees){
            if(emp.getFirstName().equals(firstName) && emp.getAge() == age){
                employeeList.add(emp);
            }
        }
        return employeeList;
    }

    public String save() {
        createProducts();
       return "Static data added successfully";
    }*/

}
