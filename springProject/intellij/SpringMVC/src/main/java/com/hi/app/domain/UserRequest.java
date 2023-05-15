package com.hi.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor  // 기본생성자
@Setter
@Getter
@ToString
public class UserRequest {

    // 변수 선언은 파라미터 이름과 같게
    private String keyword;
    private int tno;
    private int page;
    private LocalDate date;

}