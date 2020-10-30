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
	
	public int writeBoard(BoardVo boardVo) {
		return sqlSession.insert(NAMESPACE+"writeBoard",boardVo);
	}

	public List viewBoardList() {
		return sqlSession.selectList(NAMESPACE+"viewBoardList");
	}

	public BoardVo viewBoard(int postno) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"viewBoard", postno);
	}

	public int updateBoard(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"updateBoard", boardVo);
	}

	public int deleteBoard(int postno) {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"deleteBoard", postno);
	}
}
