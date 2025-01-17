package com.example.Employee_Managment.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    
    
    public Designation() {
		// TODO Auto-generated constructor stub
	}
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public Designation(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}


	@Override
	public String toString() {
		return "Designation [id=" + id + ", title=" + title + "]";
	}
	
	
	
	
    
}
