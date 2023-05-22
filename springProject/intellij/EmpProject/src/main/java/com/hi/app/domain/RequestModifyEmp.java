package com.hi.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RequestModifyEmp {

    private String ename;
    private String job;
    private String mgr;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptno;
    private MultipartFile file;
    private String filename;
    private String oldfile;

}
