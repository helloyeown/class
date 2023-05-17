package com.hi.deptspring.deptspring.mapper;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.domain.DeptSearchOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    // 전체 부서 리스트
    List<DeptDTO> selectAll();

    List<DeptDTO> selectAll2();

    // 검색어로 검색 결과 반환
    List<DeptDTO> selectByOption(DeptSearchOption option);

    // deptno 기반으로 검색 -> DeptDTO
    DeptDTO selectByDeptno(int deptno);

    List<DeptDTO> selectByDeptnos(List<Integer> deptnos);

    // DeptRegistRequest를 받아서 insert 해주는 메소드
    int insertDept(DeptRegistRequest request);

    int insertDept2(DeptDTO deptDTO);


    // DeptDTO를 전달 받고 update -> dml은 int 리턴
    int updateDept(DeptDTO deptDTO);

    int deleteDept(int deptno);

}
