package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestRegBoard {

    private String title;
    private String content;
    private String writer;

}
