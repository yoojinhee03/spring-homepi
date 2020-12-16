package com.example.homepi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.homepi.service.UserServiceInterface;
import com.example.homepi.vo.UserVo;

@Controller
public class UserController {

	@Autowired 
	UserServiceInterface userService;
	
	@GetMapping(value="homepi/login")
	public String login() {
		return "login";
	}
	@PostMapping(value="homepi/loginProc")
	public String loginProc(UserVo userVo,Model model) {
				
		Boolean result=userService.loginProc(userVo)==null?false:true;
		System.out.println(result);
		if(result) {
			//model.addAttribute("user", userService.loginProc(userVo));
			return "redirect:.";
		}else {
			return "login";
		}
		//System.out.println(result);
	}
}
