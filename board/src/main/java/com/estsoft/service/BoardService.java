package com.estsoft.service;

import java.util.List;

import com.estsoft.domain.Board;

public interface BoardService {
	List<Board> list();
	
	List<Board> findById(String id);
}
