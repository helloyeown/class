package com.app.springex;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// 럼벅의 어노테이션
public class DeptDTO {

    private int deptno;
    private String dname;
    private String loc;

    public static void main(String[] args) {

        DeptDTO dept = new DeptDTO(2, "test", "loc");
        System.out.println(dept);
        dept.setDeptno(10);
        dept.setDname("ACCOUNTING");
        dept.setLoc("NEW YORK");
        System.out.println(dept.getLoc());

    }
}