package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptDeleteService {

    @Autowired
    private DeptMapper mapper;

    public int deleteDept(int deptno){
        return mapper.deleteDept(deptno);
    }

}
