package com.thanesh.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!, Java, Python, Node.js, Go, C++, Rust, C#, PHP, Ruby, Swift, Kotlin, Dart, Scala, Elixir, Haskell, Lua, Perl, Groovy, TypeScript, JavaScript, HTML, CSS, SQL, Bash/Shell scripting";
    }
}
