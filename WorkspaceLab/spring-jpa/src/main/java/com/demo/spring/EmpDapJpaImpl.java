package com.demo.spring;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class EmpDapJpaImpl implements EmpDao {

	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public String saveEmp(Employee e) {
		em.persist(e);
		return "saved";
	}

	@Override
	public List<Employee> getAllEmps() {
		javax.persistence.Query query = em.createQuery("select e from Employee e");
		List<Employee> emps = query.getResultList();

		return emps;
	}

	@Override
	public Employee findById(int empid) {
		Employee e = em.find(Employee.class, empid);
		return e;
	}

	@Override
	public String deleteEmp(int empid) {
		Employee e = em.find(Employee.class, empid);
		if (e != null) {
			em.remove(e);
			return "Emp Deleted.";
		}
		return "Emp Not found.";
	}

	@Override
	public Employee updateEmp(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveAll(List<Employee> empList) {
		// TODO Auto-generated method stub
		return null;
	}

}
