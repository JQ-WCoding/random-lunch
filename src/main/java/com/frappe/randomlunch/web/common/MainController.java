package com.frappe.randomlunch.web.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "main" );
        modelAndView.addObject( "content", "layout/main.jsp" );
        return modelAndView;
    }

     @GetMapping(value = "/service")
     public ModelAndView service(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "main" );
        modelAndView.addObject( "content", "menu/menuContent.jsp" );
        return modelAndView;
     }

//     @RequestMapping ( value = "/menu" )
//     public String menu() {
//         return "menu/menu";
//     }

    // @RequestMapping ( value = "/board" )
    // public String board() {
    //     return "board/board";
    // }

}
