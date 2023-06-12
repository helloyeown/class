package org.zerock.todo.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.cglib.core.Local;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.todo.dto.ReplyDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor    // 서비스 자동 주입
@RequestMapping("/replies/")
public class ReplyController {

    // 댓글 추가
    @PostMapping("{tno}/new")
    public Map<String, Long> register(@PathVariable("tno") Long tno, 
        @RequestBody ReplyDTO replyDTO) {
        
        // 안전장치
        replyDTO.setTno(tno);

        log.info(replyDTO);

        return Map.of("result", 321L);
    }
    
    // consumes: 받아들이는 데이터 명시
    // produces: 만들어내는 데이터 명시
    // 댓글 목록
    @GetMapping(value = "{tno}/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReplyDTO> getReplyList(@PathVariable("tno") Long tno){

        log.info("TNO: " + tno);

        // 가짜 데이터
        // 1-10까지 루프를 돌리면서 리스트에 ReplyDTO를 넣음
        List<ReplyDTO> result = IntStream.rangeClosed(1, 10).mapToObj(i->{
            
            return ReplyDTO.builder()
            .rno((long)i)
            .tno(tno)
            .reply("댓글..." + i)
            .replyer("user00")
            .replyDate(LocalDate.now())
            .build();

        }).collect(Collectors.toList());

        return result;
    }

}
