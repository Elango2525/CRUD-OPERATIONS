package com.example.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
