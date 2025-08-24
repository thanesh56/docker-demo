package com.thanesh.docker_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello")
    public String helloWorld() {
        logger.info("Hello endpoint was called");
        return "Hello, World!, Java, Python, Node.js, Go, C++, Rust, C#, PHP, Ruby, Swift, Kotlin, Dart, Scala, Elixir, Haskell, Lua, Perl, Groovy, TypeScript, JavaScript, HTML, CSS, SQL, Bash/Shell scripting";
    }

    @GetMapping("/hi")
    public String hi() {
        logger.info("hi endpoint was called");
        return "Hi, this is for testing working of github and jenkins integration with docker and kubernetes. " +
                "\nThis is a simple application to demonstrate the CI/CD pipeline using Jenkins, Docker, and Kubernetes. " +
                "\nIt is built using Spring Boot and serves a simple message when accessed via HTTP GET request. " +
                "\nThe application can be containerized using Docker and deployed on a Kubernetes cluster for scalability and reliability.";
    }
}
