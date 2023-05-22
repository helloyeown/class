package com.hi.board.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class BoardSearchOption {

    private String searchType;
    private String keyword;

}
