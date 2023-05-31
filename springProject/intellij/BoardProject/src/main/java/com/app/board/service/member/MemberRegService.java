package com.app.board.service.member;

import com.app.board.domain.member.MemberRegRequest;
import com.app.board.mapper.MemberMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Service
@Log4j2
public class MemberRegService {

    @Autowired
    private MemberMapper mapper;

    public int memberRegist(MemberRegRequest memberRegRequest, HttpServletRequest request){

        if(memberRegRequest.getUphoto()!=null && memberRegRequest.getUphoto().getSize()>0){

            String uri = "/uploadfile/member";
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            String newFilename = memberRegRequest.getUid() + "_" + memberRegRequest.getUphoto().getOriginalFilename();
            File newFile = new File(realPath, newFilename);

            try {
                memberRegRequest.getUphoto().transferTo(newFile);
                memberRegRequest.setFilename(newFilename);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        log.info("regMember >>>>> " + memberRegRequest);

        return mapper.registMember(memberRegRequest);
    }

}
