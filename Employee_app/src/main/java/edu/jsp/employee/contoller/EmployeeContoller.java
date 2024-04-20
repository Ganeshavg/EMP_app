package edu.jsp.employee.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.employee.dao.EmployeeDao;
import edu.jsp.employee.dto.Employee;

@RestController
public class EmployeeContoller {
	@Autowired
EmployeeDao dao;
@PostMapping("saveEmployee")
public Employee saveEmployee(@RequestBody Employee e) {
	return dao.saveEmployee(e);
}
}