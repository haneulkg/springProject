package com.spring.sExam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ctom")
public class CtomController {
	
	@RequestMapping(value = "/c1", method = RequestMethod.GET)
	public String c1Get(@RequestParam(name="flag", defaultValue = "", required = false) String flag) {
		if(flag.equals("OK")) {
			System.out.println("c1Service2다녀옴");
		}
		return "ctom/c1";
	}

	@RequestMapping(value = "/c1Service", method = RequestMethod.GET)
	public String c1ServiceGet() {
		System.out.println("현재 c1Service");
		System.out.println("작업중");
		System.out.println("작업완료");
		//return "ctom/c1";
		return "redirect:/ctom/c1";
	}
	
	@RequestMapping(value = "/c1Service2", method = RequestMethod.GET)
	public String c1Service2Get() {
		System.out.println("현재 c1Service2");
		System.out.println("작업중2");
		System.out.println("작업완료2");

		//return "redirect:/ctom/c1";
		return "redirect:/ctom/c1?flag=OK";
	}
	
}
