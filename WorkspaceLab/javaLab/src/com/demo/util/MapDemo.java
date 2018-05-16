package com.demo.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, Employee> empDb = new HashMap<>();
		empDb.put(100, new Employee(100, "A", "Hyderabad", 34000));
		empDb.put(101, new Employee(101, "A", "Hyderabad", 34000));
		empDb.put(102, new Employee(102, "A", "Hyderabad", 34000));
		empDb.put(103, new Employee(103, "A", "Hyderabad", 34000));
		empDb.put(104, new Employee(104, "A", "Hyderabad", 34000));
		empDb.put(105, new Employee(105, "A", "Hyderabad", 34000));
		empDb.put(106, new Employee(106, "A", "Hyderabad", 34000));

		System.out.println(empDb);

		Set<Integer> keys = empDb.keySet();

		for (Integer key : keys) {
			Employee e = empDb.get(key);
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getCity() + " " + e.getSalary());
		}
	}
}
