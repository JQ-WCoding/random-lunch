package com.frappe.randomlunch.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MainController {

    @RequestMapping( value = "/index" )
    public String index() {
        log.debug( "test" );
        return "default";
    }

}
