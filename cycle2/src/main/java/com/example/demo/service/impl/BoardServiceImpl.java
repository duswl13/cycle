package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	BoardDao boardDao;
	


	@Override
	public Board selectBoardDetail(Board board) {
		return boardDao.findById(board.getBoardSkey()).orElse(null);
	}

	@Override
	public Board saveBoard(Board board) {
		return boardDao.save(board);
	}

	@Override
	public List<Board> findByDeleteynAndType(String deleteYn, String type) {
		return boardDao.findByDeleteYnAndType(deleteYn, type);
	}

    
}
