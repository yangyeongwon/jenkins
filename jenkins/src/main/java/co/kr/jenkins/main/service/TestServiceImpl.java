package co.kr.jenkins.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.kr.jenkins.main.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService{
	@Autowired TestMapper testMapper;
	
}
