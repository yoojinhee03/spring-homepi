package com.example.homepi.service;

import java.util.Map;

import com.example.homepi.vo.UserVo;

public interface UserServiceInterface {

	//로그인
	public UserVo loginProc(UserVo userVo);
}
