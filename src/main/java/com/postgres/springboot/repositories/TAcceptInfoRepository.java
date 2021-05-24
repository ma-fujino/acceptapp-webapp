package com.postgres.springboot.repositories;

import com.postgres.springboot.TAcceptInfo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TAcceptInfoRepository  extends JpaRepository<TAcceptInfo, String>{
	
	public Optional<TAcceptInfo> findByAcceptInfoNo(String acceptInfoNo);

}
