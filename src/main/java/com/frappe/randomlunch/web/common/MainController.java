package com.frappe.randomlunch.web.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MainController {
    // 임시
    @RequestMapping( value = "/index" )
    public String index() {
        log.debug( "test" );
        return "default";
    }

    @RequestMapping ( value = "/" )
    public String hello() {
        return "index";
    }
}
