package com.hi.board.service;

import com.hi.board.domain.RequestModifyBoard;
import com.hi.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@Log4j2
public class BoardModifyService {

    @Autowired
    private  BoardMapper mapper;

    public int modifyBoardDTO(RequestModifyBoard requestModifyBoard,
                              HttpServletRequest request){

        // 파일 저장: 첨부한 파일이 존재하면 저장
        if (requestModifyBoard.getFile()!=null && requestModifyBoard.getFile().getSize()>0){

            // 웹 경로
            String uri = "/uploadfile/board";
            // 실제 경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            // 새로운 파일 이름
            String newFilename = UUID.randomUUID().toString() + requestModifyBoard.getFile().getOriginalFilename();
            // 저장
            File newFile = new File(realPath, newFilename);
            try {
                requestModifyBoard.getFile().transferTo(newFile);
                // filename 속성에 새로운 파일 이름 저장
                requestModifyBoard.setFilename(newFilename);
            } catch (IOException e) {
//                throw new RuntimeException(e);
                // filename: oldfile의 파일 이름 설정
                requestModifyBoard.setFilename(requestModifyBoard.getOldfile());
            }
        } else {
            // filename 속성에 이전 업로드 된 파일 이름 저장
            requestModifyBoard.setFilename(requestModifyBoard.getOldfile());
        }

        log.info(requestModifyBoard);

        // mapper에 update 요청
        return mapper.updateBoard(requestModifyBoard);
    }

}
