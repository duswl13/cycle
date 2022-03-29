package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Board;
import com.example.demo.entity.User;
import com.example.demo.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
    @GetMapping("/board")
    public String index(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            request.setAttribute("user", user);
        }

        List<Board> boards = boardService.findByDeleteynAndType("N","BOARD");
  
        request.setAttribute("boards", boards);

        return "board/finish";
    }
	
}
