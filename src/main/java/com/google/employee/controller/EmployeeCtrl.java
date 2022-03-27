package com.google.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.employee.domain.Employee;
import com.google.employee.repository.EmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeCtrl {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeCtrl() {
	}

	@GetMapping("/{id}")
    public String viewBooks(@PathVariable("id") int id, Model model) {
		Employee employee = employeeRepository.findById(id).get();
        model.addAttribute("employee", employee);
        return "getByID";
    }
	
	@GetMapping("/employeeForm")
    public String viewBooks() {
        return "employeeForm";
    }
	
	@GetMapping("/")
    public String index() {
        return "index";
    }

	@GetMapping("/listEmployees")
    public String viewBooks(Model model) {
		List<Employee> employees = employeeRepository.findAll();
		model.addAttribute("employees", employees);
        return "listEmployees";
    }
	
	@GetMapping("/listEmployeesGreaterThan/{id}")
    public String listEmployeesGreaterThan(@PathVariable("id") int id, Model model) {
		List<Employee> employees = employeeRepository.findByIdGreaterThan(id);
		model.addAttribute("employees", employees);
        return "listEmployees";
    }
	
	@PostMapping("/saveEmployee")
    public String viewBooks(Employee employee, Model model) {
		employeeRepository.save(employee);
        model.addAttribute("message", "saved succefully");
        return "confirm";
    }
}
