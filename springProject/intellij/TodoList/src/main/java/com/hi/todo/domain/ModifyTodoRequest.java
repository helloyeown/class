package com.hi.todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ModifyTodoRequest {

    private int tno;
    private String todo;
    private String duedate;
    private String finished;

}
