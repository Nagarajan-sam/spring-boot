package com.kani.demos.sbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync // background thread of the pool
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
