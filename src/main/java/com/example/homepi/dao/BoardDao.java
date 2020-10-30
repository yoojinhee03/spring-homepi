package com.example.homepi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.homepi.vo.BoardVo;

@Repository
public class BoardDao {
	protected static final String NAMESPACE = "com.example.homepi.dao.BoardDao.";
	
	@Autowired
	private SqlSession sqlSession;
	
	public void writeBoard(BoardVo boardVo) {
		sqlSession.insert(NAMESPACE+"writeBoard",boardVo);
	}

	public List viewBoard() {
		return sqlSession.selectList(NAMESPACE+"viewBoard");
	}
}
