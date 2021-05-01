package com.frappe.randomlunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// db 지정 풀어두기
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
// @SpringBootApplication
public class RandomLunchApplication {

    public static void main(String[] args) {
        SpringApplication.run( RandomLunchApplication.class, args );
    }

}
