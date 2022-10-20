package com.rahul.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.entity.Company;
import com.rahul.exceptions.CompanyNotFoundException;
import com.rahul.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository repo;
	
	@Override
	public Long createCompany(Company cob) {
		return repo.save(cob).getId();
	}

	@Override
	public void updateCompany(Company cob) {
		if(cob.getCregId()!=null && repo.existsById(cob.getId()))
			repo.save(cob);

	}

	@Override
	public Company getOneCompany(Long id) {
		Optional<Company> opt=repo.findById(id);
		if(opt.isEmpty()) {
		throw new CompanyNotFoundException("Given id: '"+id+"' Not Exist");
	} else {
		return opt.get();
	}
	}

	@Override
	public List<Company> getAllCompanies() {
		return repo.findAll();
	}

}
