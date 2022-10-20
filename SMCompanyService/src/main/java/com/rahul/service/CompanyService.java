package com.rahul.service;

import java.util.List;

import com.rahul.entity.Company;

public interface CompanyService {
	
	Long createCompany(Company cob);
	void updateCompany(Company cob);
	Company getOneCompany(Long id);
	List<Company> getAllCompanies();

}
