package com.hi.app.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class EmpDTO {

    private int empno;
    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptno;


}
