package com.frappe.randomlunch.web.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class MainController {
    // 임시
    @RequestMapping ( value = "/index" )
    public String index() {
        log.debug( "test" );
        return "default";
    }

    @GetMapping ( value = "/home" )
    public String home() {
        return "index";
    }

    // @GetMapping(value = "/service")
    // public

    // @RequestMapping ( value = "/menu" )
    // public String menu() {
    //     return "menu/menu";
    // }
    //
    // @RequestMapping ( value = "/board" )
    // public String board() {
    //     return "board/board";
    // }

}
