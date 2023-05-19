package com.hi.app.service;

import com.hi.app.domain.RequestRegEmp;
import com.hi.app.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpRegistService {

    @Autowired
    private EmpMapper mapper;

    public int regist(RequestRegEmp emp){

        return mapper.insertEmp(emp);
    }

}
