package com.postgres.springboot.repositories;

import com.postgres.springboot.MCustomer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MCustomerRepository  extends JpaRepository<MCustomer, String>{
	
//	public Optional<MyData> findById(Long name);

}
