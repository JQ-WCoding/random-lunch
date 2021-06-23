package com.frappe.randomlunch.web.common;

import com.frappe.randomlunch.domain.menu.MenuVO;
import com.frappe.randomlunch.service.lunch.MenusServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Slf4j
@Controller
public class MainController {

    // 임시
    @RequestMapping( value = "/index" )
    public String index() {
        log.debug( "test" );
        return "default";
    }

    @GetMapping( value = "/home" )
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "main" );
        modelAndView.addObject( "content", "layout/main.jsp" );
        return modelAndView;
    }

    @GetMapping( value = "/service/{id}" )
    public ModelAndView service( @PathVariable Long id ) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "main" );
        modelAndView.addObject( "content", "menu/menuContent.jsp" );

        return modelAndView;
    }

    @GetMapping( value = "/service/find" )
    public ModelAndView findFood() throws IOException {
        MenusServiceImpl menusService = new MenusServiceImpl();
        
        ModelAndView modelAndView = new ModelAndView();

        String check = menusService.findMenu();

        log.debug( check );

        modelAndView.setViewName( "default" );
        modelAndView.addObject( "check", check );

        return modelAndView;
    }
}
