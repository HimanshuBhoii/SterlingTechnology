package com.example.Employee_Managment.Services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee_Managment.Model.Repositories.DesignationRepository;
import com.example.Employee_Managment.Models.Designation;

@Service
public class DesignationService {
    @Autowired
    private DesignationRepository designationRepository;

    public List<Designation> getAllDesignations() {
        return designationRepository.findAll();
    }

    public Designation getDesignationById(Long id) {
        return designationRepository.findById(id)
            .orElseThrow(() -> new NoSuchElementException("Designation not found with id " + id));
    }

    public Designation saveDesignation(Designation designation) {
        return designationRepository.save(designation);
    }

    public Designation updateDesignation(Long id, Designation designationDetails) {
        Designation designation = getDesignationById(id);
        designation.setTitle(designationDetails.getTitle());
        return designationRepository.save(designation);
    }

    public void deleteDesignation(Long id) {
        designationRepository.deleteById(id);
    }
}

