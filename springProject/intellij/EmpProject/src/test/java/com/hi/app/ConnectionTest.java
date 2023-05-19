package com.hi.app;

import com.hi.app.mapper.EmpMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ConnectionTest {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private EmpMapper mapper;


    public void mapperTest(){
        Assertions.assertNotNull(mapper);
    }


    @Test
    public void ConnectionTest() throws SQLException {
        Connection conn = dataSource.getConnection();
        log.info("conn: " + conn);
        conn.close();
    }


}
