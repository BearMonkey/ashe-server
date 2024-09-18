package org.monkey.ashe.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * TestApp
 *
 * @author cc
 * @since 2024/8/30 9:31
 */
@SpringBootApplication
@ComponentScan("org.monkey.ashe")
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }
}
