package edu.jsp.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.employee.dto.Employee;
import edu.jsp.employee.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	@Autowired
EmployeeRepo repo;
public Employee saveEmployee(Employee e) {
	return repo.save(e);
}
}
