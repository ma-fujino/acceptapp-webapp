package com.postgres.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgres.springboot.repositories.MyDataRepository;

@RestController
public class MyDataRestController {

	@Autowired
	private MyDataService service;
	
	@Autowired
	MyDataRepository repository;

	@RequestMapping("/rest")
	public List<MyData> restAll() {
		return service.getAll();
	}
	
	@RequestMapping("/rest/{num}")
	public MyData restBy(@PathVariable int num) {
		return service.get(num);
	}
	
	@RequestMapping("/rest/json")
	public List<MyData> restJson(@RequestBody InputParam param) {
		return service.find(param.getParamString1(), param.getParamString2());
	}
	
	@RequestMapping("/rest/insert")
	public String insert(@RequestBody MyData myData) {
		repository.saveAndFlush(myData);
		return "OK";
	}
}
