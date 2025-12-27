package com.excelr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="excelrTable")
@Entity
public class ExcelrEntity {
	
	@Column(name="empid")
	@Id
	private Integer endId;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="empsal")
	private Integer empSal;

	public ExcelrEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExcelrEntity(Integer endId, String empName, Integer empSal) {
		super();
		this.endId = endId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Integer getEndId() {
		return endId;
	}

	public void setEndId(Integer endId) {
		this.endId = endId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "ExcelrEntity [endId=" + endId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
		
}
