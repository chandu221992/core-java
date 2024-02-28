package com.chandan.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setPhoneNumbers(Arrays.asList("1234567", "234567"));
		employee1.setJoiningDate(LocalDate.of(2009, 2, 25));
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setPhoneNumbers(Arrays.asList("34567789", "456789"));
		e1.setJoiningDate(LocalDate.of(2005, 2, 25));
		List<Employee> employeeList = Arrays.asList(employee1, e1);
		List<String> list = employeeList.stream().flatMap(e2 -> e2.getPhoneNumbers().stream()).toList();
		System.out.println(list);
		employeeList.stream().filter(e4 -> e4.getJoiningDate().isAfter(LocalDate.of(2009, 1, 1)))
				.forEach(e5 -> System.out.println(e5.getId()));
	}

}
