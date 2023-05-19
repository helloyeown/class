package com.hi.app.service;

import com.hi.app.domain.EmpDTO;
import com.hi.app.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class EmpListService {

    @Autowired
    private EmpMapper mapper;

    public List<EmpDTO> getList(){
        return mapper.selectList();
    }

}
