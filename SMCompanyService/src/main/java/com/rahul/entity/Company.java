package com.rahul.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Entity
@Data 
@Table(name="company_tab")
@DynamicUpdate 
public class Company {
	
	@Id
	@Column(name="com_id_col")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="com_name_col")
	private String name;
	
	@Column(name="com_regid_col")
	private String cregId;
	
	@Column(name="com_type_col")
	private String ctype;
	
	@Column(name="com_parent_col")
	private String parentOrg;
	
	@Column(name="com_mode_col")
	private String modeOfOperate;
	
	@Column(name="com_service_code_col")
	private String serviceCode;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="aidFk")
	private Address addr; //HAS-A RELATIONSHIP
	

}
