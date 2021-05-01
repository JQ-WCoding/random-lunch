package com.frappe.randomlunch.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
    @GetMapping ( "/hello" )
    public String hello() {
        return "hello";
    }
}
