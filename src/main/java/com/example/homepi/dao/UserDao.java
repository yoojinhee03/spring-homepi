package com.example.homepi.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.homepi.vo.UserVo;

@Repository
public class UserDao {
	
	protected static final String NAMESPACE = "com.example.homepi.dao.UserDao.";
	
	@Autowired
	private SqlSession sqlSession;
	
	
	public UserVo loginProc(UserVo userVo) {
		// TODO Auto-generated method stub
		UserVo result=sqlSession.selectOne(NAMESPACE+"loginProc", userVo);
		//System.out.println("dddddddddddd"+result.getName());
		return sqlSession.selectOne(NAMESPACE+"loginProc", userVo);
		//System.out.println(name);
	}

}
