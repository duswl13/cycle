package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Board;

public interface BoardService {
	
    Board selectBoardDetail(Board board);
    
    Board saveBoard(Board board);

	List<Board> findByDeleteynAndType(String deleteYn, String type);

}
