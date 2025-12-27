package com.excelr.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="product_table")
@Entity
public class Product {
	
	@Column(name="pid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer productId;
	
	@Column(name="pname")
	private String productName;
	
	@Column(name="pprice")
	private Integer productPrice;

	@CreationTimestamp
	@Column(name="create_time", updatable = false)
	private LocalDate createDate;
	
	@UpdateTimestamp
	@Column(name="update_time" ,insertable = false)
	private LocalDate updateDate;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer productId, String productName, Integer productPrice, LocalDate createDate,
			LocalDate updateDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
	
}
