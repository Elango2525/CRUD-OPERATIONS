package com.example.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.Models.Employee;
import com.example.Student.Repository.EmployeeRepo;

@Service

public class ApiService {

@Autowired
EmployeeRepo empRepo;
public Employee saveDetails(Employee e)
{
return empRepo.save(e);
}
public List<Employee> getDetails()
{
return empRepo.findAll();
}
public Employee updateDetails(Employee e1)
{
return empRepo.saveAndFlush(e1);
}
public void deleteDetails(int id)
{
empRepo.deleteById(id);
}

}
