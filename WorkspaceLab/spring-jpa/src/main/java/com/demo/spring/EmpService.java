package com.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("app")
public class EmpService {

	@Autowired
	EmpDao dao;

	public String registerEmployee(int id, String name, String city, double salary) {
		String resp = dao.saveEmp(new Employee(id, name, city, salary));
		if (resp != null && resp.equals("saved"))
			return "Emp Registerd";
		return "Problem Occurred";
	}

	/*
	public Employee getEmployee(int empid) {
		return dao.findById(empid);
	}
	
	public String saveEmployeeCollection(List<Employee> emps) {
		return dao.saveAll(emps);
	}
	*/
}
