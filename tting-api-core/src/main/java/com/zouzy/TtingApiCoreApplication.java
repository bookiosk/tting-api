package com.zouzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.zouzy.mapper")
@EnableAsync
@EnableScheduling
public class TtingApiCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(TtingApiCoreApplication.class, args);
    }
}