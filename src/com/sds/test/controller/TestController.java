package com.sds.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller, @Service, @Repository, @Component
//xml에 굳이 등록하여 알 필요가 없다
@Controller
public class TestController {
	
	@RequestMapping("/test.do")
	public String test(){
		System.out.println("컨트롤러 클래스 작동함..");
		return "";
	}
}	
