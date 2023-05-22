package com.hi.app.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class RequestRegEmp {

    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptno;
    private MultipartFile file;
    private String filename;

}
