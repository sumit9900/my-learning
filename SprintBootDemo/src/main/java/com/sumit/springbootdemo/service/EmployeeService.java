package com.sumit.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.springbootdemo.dao.EmployeeDAO;
import com.sumit.springbootdemo.model.Employee;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;
	
	
	public List<Employee> fetchAll(){
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeDao.findAll()
		.forEach(employeeList::add);
		return employeeList;
	}
	
	public Employee findEmployee(int id) {
		return employeeDao.findOne(id);
	}
	
	public void saveOrUpdate(Employee emp) {
		employeeDao.save(emp);
	}
	
	public void delete(int id) {
		employeeDao.delete(id);
	}
}
