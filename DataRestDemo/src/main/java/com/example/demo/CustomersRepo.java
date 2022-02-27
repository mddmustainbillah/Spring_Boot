package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cources", path = "cources")
public interface CustomersRepo extends JpaRepository<Customers, Integer>{
	
}
