package com.example.homepi.service;

import java.util.List;
import java.util.Map;

import com.example.homepi.vo.BoardVo;

public interface BoardServiceInterface {
	public void writeBoard(BoardVo boardVo);
	public List viewBoardList();
	public BoardVo viewBoard(int postno);
	public void updateBoard(BoardVo boardVo);
}
