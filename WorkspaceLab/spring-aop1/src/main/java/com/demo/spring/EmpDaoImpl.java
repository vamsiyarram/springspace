package com.demo.spring;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements EmpDao {

	public String saveEmp(Employee e) {
		System.out.println("Employee Saved..");
		return "saved";
	}

}
