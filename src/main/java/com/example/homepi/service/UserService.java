package com.example.homepi.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homepi.dao.UserDao;
import com.example.homepi.vo.UserVo;

@Service
public class UserService implements UserServiceInterface{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public UserVo loginProc(UserVo userVo) {
		// TODO Auto-generated method stub
		return userDao.loginProc(userVo);
	}

}
