package com.estsoft.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estsoft.domain.Board;
import com.estsoft.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/test")
	public String test() {
		return "HELLO WORLD";
	}
	
	@GetMapping("/writer/{id}")
	public List<Board> findByWriter(@PathVariable String id) {
		return boardService.findById(id);
	}
}
