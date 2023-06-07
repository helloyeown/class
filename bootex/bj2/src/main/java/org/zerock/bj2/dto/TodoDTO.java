package org.zerock.bj2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoDTO {
    
    private Long tno;
    private String title;
    private String writer;
    private String content;
    private boolean complete;
    private String dueDate;

}
