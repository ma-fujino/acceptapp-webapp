package com.postgres.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgDataRestController {

	@Autowired
	private MsgDataService service;
	
	@RequestMapping("/restmsg")
	public List<MsgData> restAll() {
		return service.getAll();
	}
	
	@RequestMapping("/restmsg/{num}")
	public MsgData restBy(@PathVariable int num) {
		return service.get(num);
	}
	
	@RequestMapping("/restmsg/json")
	public List<MsgData> restJson(@RequestBody InputParam param) {
		return service.find(param.getParamString1(), param.getParamString2());
	}
	
}
