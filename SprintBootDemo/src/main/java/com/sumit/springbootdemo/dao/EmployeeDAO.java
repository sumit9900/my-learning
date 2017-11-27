package com.sumit.springbootdemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sumit.springbootdemo.model.Employee;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Integer>{

}
