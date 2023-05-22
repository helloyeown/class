package com.hi.board.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MemberRegistRequest {

    private String uid;
    private String uname;
    private String pw;
    private MultipartFile uphoto;
    private String fileName;

}
