package com.hi.deptspring.deptspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DeptRegistRequest {

    private String dname;
    private String loc;

}
