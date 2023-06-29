package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    int findSalarySum();

    Employee findEmployeeWithMinSalary();

    Employee findEmployeeWithMaxSalary();

    List<Employee> findEmployeeWithSalaryHighAverage();
}
