package com.estsoft.web;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estsoft.domain.Board;
import com.estsoft.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	// 게시글 목록
	@GetMapping("/list")
	public String list(Locale locale, Model model) {
		List<Board> list = boardService.list();
		System.out.println(list.get(0).toString());
		
		
		
		model.addAttribute("list", boardService.list());
		return "/board/list";
	}
	
	@GetMapping("/writer/{id}")
	public List<Board> findByWriter(@PathVariable String id) {
		return boardService.findById(id);
	}
}
