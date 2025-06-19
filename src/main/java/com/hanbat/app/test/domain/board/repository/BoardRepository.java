package com.hanbat.app.test.domain.board.repository;

import com.hanbat.app.test.domain.board.entity.Board;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {
    List<Board> findAll();
    Optional<Board> findById(Long id);
}
