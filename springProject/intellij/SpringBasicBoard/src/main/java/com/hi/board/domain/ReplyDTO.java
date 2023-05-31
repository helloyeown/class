package com.hi.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReplyDTO {

    private int rno;
    private int bno;
    private int memIdx;
    private String reply;
    private String replyDate;
    private String updateDate;

}
