package org.monkey.ashe.test.bbbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * TestApp
 *
 * @author cc
 * @since 2024/8/30 9:31
 */
@SpringBootApplication
@ComponentScan("org.monkey.ashe")
//@EnableFeignClients
public class TestBbbbApp {
    public static void main(String[] args) {
        SpringApplication.run(TestBbbbApp.class, args);
    }
}
