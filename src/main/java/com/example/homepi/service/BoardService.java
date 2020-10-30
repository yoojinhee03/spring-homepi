package com.example.homepi.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.homepi.dao.BoardDao;
import com.example.homepi.vo.BoardVo;

@Service
public class BoardService implements BoardServiceInterface{

	@Autowired
	BoardDao boardDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED) //@Transactional(propagation=Propagation.REQUIRED)
	public void writeBoard(BoardVo boardVo) {
		boardDao.writeBoard(boardVo);
	}
	
}
