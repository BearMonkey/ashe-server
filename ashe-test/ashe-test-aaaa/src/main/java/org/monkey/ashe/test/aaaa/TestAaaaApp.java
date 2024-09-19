package org.monkey.ashe.test.aaaa;

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
@EnableFeignClients("org.monkey.ashe")
public class TestAaaaApp {
    public static void main(String[] args) {
        SpringApplication.run(TestAaaaApp.class, args);
    }
}
