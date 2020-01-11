package com.chen.damo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.chen.damo.dao")
public class DamoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DamoApplication.class, args);
    }

}
