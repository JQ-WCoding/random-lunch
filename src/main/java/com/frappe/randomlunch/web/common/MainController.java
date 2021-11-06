package com.frappe.randomlunch.web.common;

import com.frappe.randomlunch.domain.menu.MenuVO;
import com.frappe.randomlunch.service.crawler.CrawlerHandlerService;
import com.frappe.randomlunch.service.lunch.MenusServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {

    private final CrawlerHandlerService<MenuVO> siksinCrawlerService;

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

    @GetMapping ( value = "/service/find" )
    public ModelAndView findFood() throws IOException {
        MenusServiceImpl menusService = new MenusServiceImpl();

        ModelAndView modelAndView = new ModelAndView();

        String check = menusService.findMenu();
        String img = menusService.findImg();

        log.debug( check );
        log.debug( img );

        modelAndView.setViewName( "default" );
        modelAndView.addObject( "check", check );
        modelAndView.addObject( "img", img );
        return modelAndView;
    }

    @GetMapping ( value = "/service/find2" )
    public String findFood(Model model, @RequestParam ( value = "address" ) String keyword) throws IOException {

        MenuVO result = siksinCrawlerService.procSearchDom( keyword );

        log.debug( "result :: check -> {}, img -> {}", result.getCheck(), result.getImg() );

        model.addAttribute( "check", result.getCheck() );
        model.addAttribute( "img", result.getImg() );

        return "menu/menuContent";
    }
}
