package com.example.demoOpenSearch.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TodoController {
    //logback
//    private static final Logger logger
//            = LoggerFactory.getLogger(TodoController.class);

    @GetMapping
    public String get() {
//        logger.info("hello from logback");
        return "hello";
    }
}
