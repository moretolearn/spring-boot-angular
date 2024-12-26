package com.moretolearn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@GetMapping
	public List<Employee> getEmployees(){
		ArrayList<Employee> arrayList = new ArrayList<>();
		arrayList.add(new Employee("Ram", 23, 3454565.235));
		arrayList.add(new Employee("Mohan", 25, 4543565.233));
		arrayList.add(new Employee("Reddy", 43, 9454565.237));
		arrayList.add(new Employee("Manoj", 73, 5454565.235));
		arrayList.add(new Employee("Nag", 20, 3454565.239));		
		arrayList.add(new Employee("Anji", 53, 8454565.231));
		return arrayList;
	}
}
