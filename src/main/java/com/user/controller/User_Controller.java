package com.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class User_Controller {
	public void getuser() {
		System.out.println("Hello From User");
	}

}
