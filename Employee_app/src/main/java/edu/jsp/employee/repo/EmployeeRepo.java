package edu.jsp.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.employee.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
