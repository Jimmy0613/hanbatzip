package com.hanbat.app.test.application.board.service;

import com.hanbat.app.test.application.board.dto.BoardRequestDto;
import com.hanbat.app.test.domain.board.entity.Board;
import com.hanbat.app.test.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<BoardRequestDto> findAll() {
        return boardRepository.findAll().stream()
                .map(BoardRequestDto::fromEntity)
                .collect(Collectors.toList());
    }

    public BoardRequestDto findById(Long id) {
        Optional<Board> test = boardRepository.findById(id);
        return test.map(BoardRequestDto::fromEntity).orElse(null);
    }
}
