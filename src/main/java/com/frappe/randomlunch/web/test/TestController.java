package com.frappe.randomlunch.web.test;

import com.frappe.randomlunch.domain.test.TestVO;
import com.frappe.randomlunch.service.test.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * test api
 */
@RestController
@RequestMapping( value = "/test" )
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
public class TestController {

    private final TestService testService;

    @GetMapping( value = "/read" )
    public ResponseEntity<Object> read() {
        List<TestVO> list = testService.selectTestList();
        return new ResponseEntity<>( list, HttpStatus.OK );
    }
}
