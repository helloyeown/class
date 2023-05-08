package com.app.springex;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class SampleTest {

    @Autowired
    // 객체 생성을 따로 안 해도 됨 (객체 주입)
    private SampleService sampleService;

    @Test
    public void testService(){

        log.info("sampleTest... testService()...");
        sampleService.printTest();

    }

}