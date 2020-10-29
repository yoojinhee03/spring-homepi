package com.example.homepi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homepi.service.BoardServiceInterface;
import com.example.homepi.vo.BoardVo;

@Controller
public class BoardController {

	BoardServiceInterface boardSerice;
	//게시물 작성 페이지로 이동 
	@GetMapping(value="board/write.do")
	public String write() {
		return "board/write";
	}
	
	//게시물 작성 처리
	@PostMapping(value="board/write.do")
	public String writeProc(BoardVo boardVo) {
		
		boardSerice.writeBoard(boardVo);
		return "redirect:/";
	}
}
