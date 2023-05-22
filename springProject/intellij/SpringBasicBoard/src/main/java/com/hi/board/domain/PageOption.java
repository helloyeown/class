package com.hi.board.domain;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PageOption {

    private BoardSearchOption searchOption;
    private int startNum;
    private int count;

}
