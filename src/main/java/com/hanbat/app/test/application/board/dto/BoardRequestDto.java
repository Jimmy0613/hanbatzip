package com.hanbat.app.test.application.board.dto;

import com.hanbat.app.test.domain.board.entity.Board;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class BoardRequestDto {
    private final long id;
    private final LocalDateTime createdAt;
    private final String test;

    public static BoardRequestDto fromEntity(Board test) {
        return BoardRequestDto.builder()
                .id(test.getId())
                .createdAt(test.getCreatedAt())
                .test(test.getTest())
                .build();
    }
}
