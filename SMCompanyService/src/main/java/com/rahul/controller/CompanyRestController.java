package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.entity.Company;
import com.rahul.exceptions.CompanyNotFoundException;
import com.rahul.service.CompanyService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/company")
@Slf4j
public class CompanyRestController {
	
	@Autowired
	private CompanyService service;
	
	//1. CREATE COMPANY
	@PostMapping("/create")
	public ResponseEntity<String> createCompany(@RequestBody Company company){
		log.info("ENTERED INTO SAVE METHOD");
		ResponseEntity<String> response=null;
		try {
			Long id=service.createCompany(company);
			response=ResponseEntity.ok("CREATED WITH ID : "+id);
			log.info("COMPANY CREATED {}: ",id);
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}
		log.info("ABOUT TO LEAVE SAVE METHOD");
		return response;
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Company>> getAllCompanies(){
		log.info("ENTERED INTO GET ALL COMPANIES METHOD");
		ResponseEntity<List<Company>> response=null;
		try {
			List<Company> list=service.getAllCompanies();
			response=ResponseEntity.ok(list);	
			log.info("GET ALL COMPANIES IS SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
		}
		log.info("ABOUT TO LEAVE GET ALL COMAPNIES METHOD");
		return response;
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Company> getOneCompany(@PathVariable Long id){
		log.info("ENTERED INTO GET ONE COMPANY METHOD");
		ResponseEntity<Company> response=null;
		try {
			Company cob=service.getOneCompany(id);
			response=ResponseEntity.ok(cob);	
			log.info("GET ONE COMPANY IS SUCCESS");
		} catch (CompanyNotFoundException e) {
			//e.printStackTrace();
			log.error(e.getMessage());
			throw e;
		}
		log.info("ABOUT TO LEAVE GET ONE COMPANY METHOD");
		return response;
	}

}
