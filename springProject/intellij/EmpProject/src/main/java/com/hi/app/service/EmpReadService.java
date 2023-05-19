package com.hi.app.service;

import com.hi.app.domain.EmpDTO;
import com.hi.app.mapper.EmpMapper;
import org.springframework.stereotype.Service;

@Service
public class EmpReadService {

    private EmpMapper mapper;

    public EmpDTO readEmp(int empno){
        return mapper.selectByEmpno(empno);
    }

}
