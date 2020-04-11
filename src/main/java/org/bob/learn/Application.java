package org.bob.learn;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@MapperScan(basePackages = "org.bob.learn.dao.mapper")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        log.info("Learn-Undertow应用启动开始");
        SpringApplication.run(Application.class, args);
        log.info("Learn-Undertow应用启动成功");
    }
}