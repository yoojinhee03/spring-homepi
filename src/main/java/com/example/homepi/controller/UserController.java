package com.example.homepi.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	public String loginProc(UserVo userVo,Model model,HttpServletRequest request) throws Exception{
		
		UserVo user=userService.loginProc(userVo);
		Boolean result=user==null?false:true;
		HttpSession session=request.getSession();
		
		if(result) {
			session.setAttribute("id", userVo.getId());
			session.setAttribute("password", userVo.getPassword());
			session.setAttribute("name", user.getName());
			return "redirect:.";
		}else {
			return "login";
		}
		//System.out.println(result);
	}
}
