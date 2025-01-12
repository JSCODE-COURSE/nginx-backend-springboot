package com.example.nginxbackendspringboot;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("boards")
public class BoardController {

  @GetMapping()
  public List<Board> getBoards() {
    List<Board> boards = new ArrayList<>();
    boards.add(new Board(1L, "제목1", "내용1"));
    boards.add(new Board(2L, "제목2", "내용2"));
    boards.add(new Board(3L, "제목3", "내용3"));
    return boards;
  }
}