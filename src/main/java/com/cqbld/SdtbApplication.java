package com.cqbld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.**.dao")
@ComponentScan(value = "com.**")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SdtbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdtbApplication.class, args);
    }

}
