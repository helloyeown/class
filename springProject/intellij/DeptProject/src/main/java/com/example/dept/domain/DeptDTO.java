package com.example.dept.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

}
