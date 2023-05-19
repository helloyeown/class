package com.hi.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestRegBoard {

    private String title;
    private String content;
    private String writer;
    // 파일 업로드를 위해 변수 추가
    private MultipartFile file; // 사용자로부터 받는 파일 객체
    private String filename;    // DB에 저장할 File 이름

}
