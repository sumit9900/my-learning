package com.sumit.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.springbootdemo.model.Employee;
import com.sumit.springbootdemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/employees")
	public List<Employee> findAll() {
		return empService.fetchAll();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee findEmployee(@PathVariable int id) {
		return empService.findEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/employees" )
	public void addEmployee(@RequestBody Employee emp) {
		empService.saveOrUpdate(emp);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public void updateEmployee(@RequestBody Employee emp, @PathVariable int id) {
		empService.saveOrUpdate(emp);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/employee/delete/{id}")
	public void deleteEmployee(@RequestAttribute int id) {
		empService.delete(id);
	}
}
