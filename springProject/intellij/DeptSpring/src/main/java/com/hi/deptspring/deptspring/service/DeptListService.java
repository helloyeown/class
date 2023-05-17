package com.hi.deptspring.deptspring.service;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptSearchOption;
import com.hi.deptspring.deptspring.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptListService {

    @Autowired
    private DeptMapper mapper;

    public List<DeptDTO> getList(){
        return mapper.selectAll();
    }


    // DeptSearchOption을 받고 검색 결과 반환
    public List<DeptDTO> getSearchList(DeptSearchOption option){
        return mapper.selectByOption(option);


    }

}
