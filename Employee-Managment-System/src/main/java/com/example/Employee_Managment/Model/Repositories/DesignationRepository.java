package com.example.Employee_Managment.Model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee_Managment.Models.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {

}
