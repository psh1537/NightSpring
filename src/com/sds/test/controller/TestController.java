package com.sds.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller, @Service, @Repository, @Component
//xml�� ���� ����Ͽ� �� �ʿ䰡 ����
@Controller
public class TestController {
	
	@RequestMapping("/test.do")
	public String test(){
		System.out.println("��Ʈ�ѷ� Ŭ���� �۵���..");
		return "";
	}
}	
