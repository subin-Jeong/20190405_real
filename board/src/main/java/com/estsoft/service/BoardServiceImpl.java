package com.estsoft.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estsoft.domain.Board;
import com.estsoft.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardRepository boardRepository;
	
	@Override
	@Transactional
	public List<Board> list() {
		return boardRepository.findAll();
	}
	
	@Override
	@Transactional
	public List<Board> findById(String id) {
		return boardRepository.findById(id).collect(Collectors.toList());
	}
}
