package com.example.Employee_Managment.Models;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String fullName;
    private String mobileNumber;
    private String addressLine1;
    private String addressLine2;
    private String district;
    private String tehsil;
    private String cityVillage;
    private String pinCode;
    private Date startDate;
    private Boolean resigned;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "designation_id")
    private Designation designation;

    private BigDecimal salary;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTehsil() {
		return tehsil;
	}

	public void setTehsil(String tehsil) {
		this.tehsil = tehsil;
	}

	public String getCityVillage() {
		return cityVillage;
	}

	public void setCityVillage(String cityVillage) {
		this.cityVillage = cityVillage;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Boolean getResigned() {
		return resigned;
	}

	public void setResigned(Boolean resigned) {
		this.resigned = resigned;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Employee(Long id, User user, String fullName, String mobileNumber, String addressLine1, String addressLine2,
			String district, String tehsil, String cityVillage, String pinCode, Date startDate, Boolean resigned,
			Date endDate, Designation designation, BigDecimal salary) {
		super();
		this.id = id;
		this.user = user;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.tehsil = tehsil;
		this.cityVillage = cityVillage;
		this.pinCode = pinCode;
		this.startDate = startDate;
		this.resigned = resigned;
		this.endDate = endDate;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", user=" + user + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", district=" + district
				+ ", tehsil=" + tehsil + ", cityVillage=" + cityVillage + ", pinCode=" + pinCode + ", startDate="
				+ startDate + ", resigned=" + resigned + ", endDate=" + endDate + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
    
    
}
