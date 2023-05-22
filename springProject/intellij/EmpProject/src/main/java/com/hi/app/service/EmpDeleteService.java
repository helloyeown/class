package com.hi.app.service;

import com.hi.app.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class EmpDeleteService {

    @Autowired
    private EmpMapper mapper;

    public int deleteEmp(int empno){
        log.info("delete Service...");

        return mapper.deleteEmp(empno);
    }

}
