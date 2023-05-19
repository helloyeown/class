package com.hi.board;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestRegBoard;
import com.hi.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {

    @Autowired
    private DataSource dataSource;
    @Autowired(required = false)
    private BoardMapper boardMapper;

    @Test
    public void selectByBnoTest(){
        BoardDTO board = boardMapper.selectByBno(1);
        log.info("1번 게시물: " + board);
        board = boardMapper.selectByBno(5);
        log.info("5번 게시물: " + board);
    }



    @Test
    public void deptListTest(){

        List<BoardDTO> list = boardMapper.selectAll();
        log.info(list);

    }



    @Test
    public void boardInsertTest(){

        RequestRegBoard board = RequestRegBoard.builder().title("테스트 제목").content("테스트 내용").writer("작성자").build();
        log.info(board);

        boardMapper.insertBoard(board);

    }


    @Test
    public void mapperTest(){

        Assertions.assertNotNull(boardMapper);

    }


    @Test
    public void connectionTest() throws SQLException {

        Connection conn = dataSource.getConnection();
        log.info("conn: " + conn);
        conn.close();

    }

}
