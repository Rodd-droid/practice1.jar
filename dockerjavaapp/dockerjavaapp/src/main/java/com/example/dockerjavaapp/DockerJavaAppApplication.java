package com.example.dockerjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerJavaAppApplication {

	public static void main(String[] args) {
        SpringApplication.run(DockerJavaAppApplication.class, args);
    }

    @RestController
    class HelloController {

        @GetMapping("/")
        public String hello() {
            return "Hello, World from Dockerized Spring Boot App!";
        }

        @GetMapping("/greet/{name}")
        public String greet(@PathVariable String name) {
            return "Hello, " + name + "!";
        }
    }

}
