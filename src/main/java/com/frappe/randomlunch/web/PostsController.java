package com.frappe.randomlunch.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
    @GetMapping ( "/main" )
    public String hello() {
        return "/main/main";
    }
}
