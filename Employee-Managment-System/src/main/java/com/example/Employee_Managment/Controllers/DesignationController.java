package com.example.Employee_Managment.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee_Managment.Models.Designation;
import com.example.Employee_Managment.Services.DesignationService;

@RestController
@RequestMapping("/api/designations")
public class DesignationController {
    @Autowired
    private DesignationService designationService;

    @GetMapping
    public List<Designation> getAllDesignations() {
        return designationService.getAllDesignations();
    }

    @GetMapping("/{id}")
    public Designation getDesignationById(@PathVariable Long id) {
        return designationService.getDesignationById(id);
    }

    @PostMapping
    public Designation createDesignation(@RequestBody Designation designation) {
        return designationService.saveDesignation(designation);
    }

    @PutMapping("/{id}")
    public Designation updateDesignation(@PathVariable Long id, @RequestBody Designation designationDetails) {
        return designationService.updateDesignation(id, designationDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDesignation(@PathVariable Long id) {
        designationService.deleteDesignation(id);
        return ResponseEntity.noContent().build();
    }
}

