package com.hi.board.domain.member;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class MemberDTO {

    private int idx;
    private String uid;
    private String uname;
    private String uphoto;

}
