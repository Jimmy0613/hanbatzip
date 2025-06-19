package com.hanbat.app.test.infrastructure.board;

import com.hanbat.app.test.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepository extends JpaRepository<Board, Long> {
}
