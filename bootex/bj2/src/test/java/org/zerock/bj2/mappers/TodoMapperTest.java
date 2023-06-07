package org.zerock.bj2.mappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.bj2.dto.TodoDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoMapperTest {
    
    @Autowired(required = false)
    private TodoMapper mapper;


    @Transactional
    @Test
    void insertTest(){

        Assertions.assertNotNull(mapper, "Todo Mapper");

        TodoDTO todo = TodoDTO.builder()
            .title("title")
            .content("content")
            .writer("writer")
            .dueDate("2023-06-07").build();

        int count = mapper.insert(todo);

        Assertions.assertEquals(count, 1);

        log.info("========================");
        log.info(todo.getTno());
        log.info("========================");

    }

}
