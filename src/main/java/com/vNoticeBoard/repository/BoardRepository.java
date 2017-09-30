package com.vNoticeBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vNoticeBoard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
	public Board findByName(String name);
}
