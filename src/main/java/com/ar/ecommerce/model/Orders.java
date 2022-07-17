package com.ar.ecommerce.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String customer_id;
	
	@Column
	@NotBlank
	private String product_id;

	@Column
	@NotBlank
	private String name_product;
	
	@Column
	@NotBlank
	private String made_product;
	
	@Column
	@NotBlank
	private String category_product;
	
	@Column
	@NotBlank
	private String shipping;
	
	@Column
	@NotBlank
	private String address_user;
	
	@Column
	@JsonFormat(pattern = "ddd/MM/yyyy")
	private Date order_date;
	
	@Column
	@NotBlank
	private String order_status;
	
	@Column
	private String quantity;

	@Column
	@NotBlank
	private String price_product;
	
	@Column
	@NotBlank
	private String active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getName_product() {
		return name_product;
	}

	public void setName_product(String name_product) {
		this.name_product = name_product;
	}

	public String getMade_product() {
		return made_product;
	}

	public void setMade_product(String made_product) {
		this.made_product = made_product;
	}

	public String getCategory_product() {
		return category_product;
	}

	public void setCategory_product(String category_product) {
		this.category_product = category_product;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getAddress_user() {
		return address_user;
	}

	public void setAddress_user(String address_user) {
		this.address_user = address_user;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getPrice_product() {
		return price_product;
	}

	public void setPrice_product(String price_product) {
		this.price_product = price_product;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	
	
}
