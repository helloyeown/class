package com.hi.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RequestModifyBoard {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private String oldfile;
    private MultipartFile file;
    private String filename;

}
