package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
  private static List<Employee> Employees = new ArrayList<Employee>();

  static {
    Employee e1 = new Employee("Robert", "Canada");
    Employee e2 = new Employee("Rocky", "Russia");
    Employee e3 = new Employee("Rolland", "Argentina");
    Employee e4 = new Employee("Ralph", "Spain");
    Employees.add(e1);
    Employees.add(e2);
    Employees.add(e3);
    Employees.add(e4);
  }

  @GetMapping
  public String getAllEmployees(Model model) {
    model.addAttribute("Employees", Employees);
    return "employees";
  }
}