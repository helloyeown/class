package com.app.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BoardDTO {

    // 디비 컬럼 이름과 일치
    private int bno;
    private String title;
    private String content;
    private String writer;
    // 업로드한 파일의 이름
    private String file;
    private String regdate;
    private String updatedate;

    // 작성자의 idx
    private int memidx;

}
