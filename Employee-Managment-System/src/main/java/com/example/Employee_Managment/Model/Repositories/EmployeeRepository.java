package com.example.Employee_Managment.Model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Employee_Managment.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
