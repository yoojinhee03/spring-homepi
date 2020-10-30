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
		int result=boardDao.writeBoard(boardVo);
		//로그 처리하기
		if(result>=1) {
			System.out.println("게시물 수정을 성공적으로 마쳤습니다.");
		}else {
			System.out.println("게시물 수정을 실패하였습니다.");
		}
	}

	@Override
	public List viewBoardList() {
		return boardDao.viewBoardList();
	}

	@Override
	public BoardVo viewBoard(int postno) {
		return boardDao.viewBoard(postno);
	}

	@Override
	public void updateBoard(BoardVo boardVo) {
		int result=boardDao.updateBoard(boardVo);
		if(result>=1) {
			System.out.println("게시물 수정을 성공적으로 마쳤습니다.");
		}else {
			System.out.println("게시물 수정을 실패하였습니다.");
		}
	}
	
}
