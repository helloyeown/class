package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptModifyService {

    @Autowired
    private DeptMapper mapper;

    public int modifyDept(DeptDTO dto){
        return mapper.updateDept(dto);
    }

}
