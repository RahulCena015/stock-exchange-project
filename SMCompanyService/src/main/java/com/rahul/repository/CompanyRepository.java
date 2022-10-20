package com.rahul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {

}
