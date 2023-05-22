package com.hi.app.mapper;

import com.hi.app.domain.EmpDTO;
import com.hi.app.domain.RequestModifyEmp;
import com.hi.app.domain.RequestRegEmp;
import org.apache.ibatis.annotations.Mapper;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Mapper
public interface EmpMapper {

    public List<EmpDTO> selectList();

    public EmpDTO selectByEmpno(int empno);

    public int updateEmp(RequestModifyEmp emp);

    public int insertEmp(RequestRegEmp emp);

    public int deleteEmp(int empno);


}
