package com.frappe.randomlunch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.MessageSourceAccessor;

@SpringBootApplication
@ServletComponentScan
@Configuration
public class RandomLunchApplication {

    @Bean
    public MessageSourceAccessor messageSourceAccessor( MessageSource messageSource ) {
        return new MessageSourceAccessor( messageSource );
    }

    public static void main(String[] args) {
        SpringApplication.run( RandomLunchApplication.class, args );
    }

}
