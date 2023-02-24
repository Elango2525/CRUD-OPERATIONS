package com.example.Student.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Models.Employee;
import com.example.Student.Service.ApiService;

@RestController
public class Controllers {

@Autowired
ApiService empService;
@PostMapping("/addDetails")
public Employee addInfo(@RequestBody Employee emp)
{
return empService.saveDetails(emp);
}
@GetMapping("/showDetails")
public List<Employee> fetchDetails()
{
return empService.getDetails();
}
@PutMapping("/updateDetails")
public Employee updateInfo(@RequestBody Employee emp1)
{
return empService.updateDetails(emp1);
}
@DeleteMapping("/delete/{id}")
public String deleteInfo(@PathVariable("id") int id)
{
empService.deleteDetails(id);
return "Deleted Details whose id is "+" "+id;
}

}