package com.hi.app.service;

import com.hi.app.domain.EmpDTO;
import com.hi.app.domain.RequestModifyEmp;
import com.hi.app.domain.RequestRegEmp;
import com.hi.app.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@Log4j2
public class EmpModifyService {

    @Autowired
    private EmpMapper mapper;

    public int modifyEmp(RequestModifyEmp emp,
                         HttpServletRequest request){

        log.info("modifyEmp Service ...");

        if (emp.getFile()!=null && emp.getFile().getSize()>0) {
            String uri = "/uploadfile/emp";
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            String newFilename = UUID.randomUUID().toString() + emp.getFile().getOriginalFilename();
            File file = new File(realPath, newFilename);

            try {
                emp.getFile().transferTo(file);
                emp.setFilename(newFilename);
            } catch (IOException e) {
//                throw new RuntimeException(e);
                log.info("파일 저장 실패...");
                emp.setFilename(emp.getOldfile());
            }

        } else {
            emp.setFilename(emp.getOldfile());
        }

        return mapper.updateEmp(emp);
    }

}
