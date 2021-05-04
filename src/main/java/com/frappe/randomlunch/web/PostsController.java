package com.frappe.randomlunch.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class PostsController {
    @RequestMapping ( value = "/" )
    public String hello() {
        return "index";
    }
}
