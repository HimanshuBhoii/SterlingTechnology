package com.example.Employee_Managment.Services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee_Managment.Model.Repositories.EmployeeRepository;
import com.example.Employee_Managment.Model.Repositories.UserRepository;
import com.example.Employee_Managment.Models.Employee;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Employee not found with id " + id));
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = getEmployeeById(id);
        employee.setFullName(employeeDetails.getFullName());
        employee.setMobileNumber(employeeDetails.getMobileNumber());
        employee.setAddressLine1(employeeDetails.getAddressLine1());
        employee.setAddressLine2(employeeDetails.getAddressLine2());
        employee.setDistrict(employeeDetails.getDistrict());
        employee.setTehsil(employeeDetails.getTehsil());
        employee.setCityVillage(employeeDetails.getCityVillage());
        employee.setPinCode(employeeDetails.getPinCode());
        employee.setStartDate(employeeDetails.getStartDate());
        employee.setResigned(employeeDetails.getResigned());
        employee.setEndDate(employeeDetails.getEndDate());
        employee.setDesignation(employeeDetails.getDesignation());
        employee.setSalary(employeeDetails.getSalary());
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

