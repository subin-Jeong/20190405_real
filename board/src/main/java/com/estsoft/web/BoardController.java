package com.estsoft.web;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService boardService;
	
	@GetMapping("/test")
	public String test() {
		logger.info("log test");
		logger.debug("log debug test");
		return "HELLO WORLD";
	}
	
	@Test
	public void test2() {
		System.out.println("HELLO WORLD");
	}
	
	@GetMapping("/writer/{id}")
	public List<Board> findByWriter(@PathVariable String id) {
		return boardService.findById(id);
	}
}
