package com.example.homepi.service;

import java.util.List;
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
	//@Transactional(propagation=Propagation.REQUIRED) //@Transactional(propagation=Propagation.REQUIRED)
	public void writeBoard(BoardVo boardVo) {
		boardDao.writeBoard(boardVo);
	}

	@Override
	public List viewBoardList() {
		return boardDao.viewBoardList();
	}

	@Override
	public BoardVo viewBoard(int postno) {
		// TODO Auto-generated method stub
		return boardDao.viewBoard(postno);
	}

	@Override
	public void updateBoard(BoardVo boardVo) {
		// TODO Auto-generated method stub
		int result=boardDao.updateBoard(boardVo);
		if(result>=1) {
			System.out.println("셩ㄱ오!!!!!!!!!!!!!!!!!!!!!");
		}else {
			System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb오!!!!!!!!!!!!!!!!!!!!!");

		}
	}
	
}
