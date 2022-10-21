package com.rahul.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cust_tab")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //for mysql
	@Column(name="cust_id_col")
	private Long id;
	
	@Column(name="cust_name_col")
	private String name;
	
	@Column(name="cust_email_col")
	private String email;
	
	@Column(name="cust_gender_col")
	private String gender;
	
	@Column(name="cust_img_col")
	private String imagePath;
	
	@Column(name="cust_mob_col")
	private String mobile;
	
	@Column(name="cust_addr_col")
	private String address;
	
	@Column(name="cust_pan_col")
	private String panCardId;
	
	@Column(name="cust_aadhar_col")
	private String aadharId;


}
