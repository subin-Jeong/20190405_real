package com.estsoft.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estsoft.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	Stream<Board> findById(String id);
}
