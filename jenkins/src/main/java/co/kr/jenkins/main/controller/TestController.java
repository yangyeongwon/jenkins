package co.kr.jenkins.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.jenkins.main.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(value= {"","/test"})
public class TestController {
	@Autowired TestService testService;
	
	@RequestMapping(value = {"/", ""}, method = {RequestMethod.GET, RequestMethod.POST})
	public String index() {
		System.out.println("!!!!");
		return "home/test";
	}

}
