package org.monkey.ashe.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ApiApp
 *
 * @author cc
 * @since 2024/9/3 14:09
 */
@SpringBootApplication
@ComponentScan("org.monkey.ashe")
public class ApiApp {
    public static void main(String[] args) {
        SpringApplication.run(ApiApp.class, args);
    }
}
