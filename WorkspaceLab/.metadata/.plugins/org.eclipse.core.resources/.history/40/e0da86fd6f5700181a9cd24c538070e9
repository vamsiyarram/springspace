package com.demo.spring;

public class EmpService {

	EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmployee(int id, String name, String city, double salary) {
		String resp = dao.saveEmp(new Employee(id, name, city, salary));
		if (resp != null && resp.equals("saved"))
			return "Emp Registerd";
		return "Problem Occurred";
	}
}
