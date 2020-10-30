package com.example.homepi.service;

import java.util.List;
import java.util.Map;

import com.example.homepi.vo.BoardVo;

public interface BoardServiceInterface {
	//게시물 작성
	public void writeBoard(BoardVo boardVo);
	//게시물 전체 출력
	public List viewBoardList();
	//게시물 상세보기
	public BoardVo viewBoard(int postno);
	//게시물 수정
	public void updateBoard(BoardVo boardVo);
	//게시물 삭제
	public void deleteBoard(int postno);
}
