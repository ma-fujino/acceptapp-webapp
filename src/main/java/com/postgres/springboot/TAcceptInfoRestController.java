package com.postgres.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.springboot.repositories.TAcceptInfoRepository;

@RestController
public class TAcceptInfoRestController {

	@Autowired
	private TAcceptInfoRepository repository;
	
	@PostMapping("/restac/insert")
	public String insert(@RequestBody TAcceptInfo tAcceptInfo) {
		repository.saveAndFlush(tAcceptInfo);
		return "OK";
	}
	
}
