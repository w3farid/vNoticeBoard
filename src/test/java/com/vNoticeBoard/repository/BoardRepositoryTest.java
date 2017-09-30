package com.vNoticeBoard.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.vNoticeBoard.VNoticeBoardApplication;
import com.vNoticeBoard.entity.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = VNoticeBoardApplication.class)
@WebAppConfiguration
public class BoardRepositoryTest {
	@Autowired
	BoardRepository boardRepository;

	Board board = new Board(1L, "GovtSchool", "GovtSchool", "Simple board text");

	@Test
	public void findByNameTest() {
		boardRepository.save(board);
		System.out.println(boardRepository.findByName("GovtSchool"));
	}

}
