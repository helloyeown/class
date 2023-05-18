package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class BoardDTO {

    // 디비 컬럼 이름과 일치
    private int bno;
    private String title;
    private String content;
    private String writer;
    private String regdate;
    private String updatedate;

}
