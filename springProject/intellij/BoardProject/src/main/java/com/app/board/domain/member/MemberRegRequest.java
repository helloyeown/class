package com.app.board.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MemberRegRequest {

    private String uid;
    private String pw;
    private String uname;
    private MultipartFile uphoto;
    private String filename;

}
