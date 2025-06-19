package com.hanbat.app.test.presentation.board;

import com.hanbat.app.test.application.board.dto.BoardRequestDto;
import com.hanbat.app.test.application.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    @ResponseBody
    public List<BoardRequestDto> list() {
        return boardService.findAll();
    }
}
