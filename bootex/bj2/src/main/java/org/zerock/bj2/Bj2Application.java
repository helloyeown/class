package org.zerock.bj2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class Bj2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bj2Application.class, args);
	}

}
