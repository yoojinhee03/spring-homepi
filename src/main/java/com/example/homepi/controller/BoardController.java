package com.example.homepi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.homepi.service.BoardServiceInterface;
import com.example.homepi.vo.BoardVo;
import com.example.homepi.vo.ListVo;

@Controller
public class BoardController {

	@Autowired
	BoardServiceInterface boardSerice;
	
	//homepi 메인페이지
	@GetMapping(value="homepi")
	public String view(Model model) {
		//ListVo listVo=new ListVo();
		//listVo.setData(boardSerice.viewBoard());
		model.addAttribute("board",boardSerice.viewBoard());
		return "board/views";
	}
	/*
	//GET
	public String view() {
		return "board/views";
	}
	
	@PostMapping(value="homepi")
	@ResponseBody
	public ListVo viewProc(Model model) {
		ListVo listVo=new ListVo();
		listVo.setData(boardSerice.viewBoard());
		//model.addAttribute("board",boardSerice.viewBoard());
		return listVo;
	}
	*/
	//게시물 작성 페이지로 이동 
	@GetMapping(value="homepi/board/write.do")
	public String write() {
		return "board/write";
	}
	
	//게시물 작성 처리
	@PostMapping(value="homepi/board/write.do")
	public String writeProc(BoardVo boardVo) {
		
		boardSerice.writeBoard(boardVo);
		return "redirect:homepi/";
	}
}
