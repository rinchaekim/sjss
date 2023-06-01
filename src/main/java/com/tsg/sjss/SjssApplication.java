package com.tsg.sjss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SjssApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjssApplication.class, args);
    }

}
