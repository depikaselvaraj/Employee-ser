package com.example.Employeedemo.Repository;

import com.example.Employeedemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByFirstNameAndAge(String firstName, long age);
}
