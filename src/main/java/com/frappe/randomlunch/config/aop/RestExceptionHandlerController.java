package com.frappe.randomlunch.config.aop;

import com.frappe.randomlunch.config.aop.exception.BizException;
import com.frappe.randomlunch.config.aop.exception.ExceptionCode;
import com.frappe.randomlunch.domain.common.ErrorMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice( annotations = RestController.class )
@Order( Ordered.HIGHEST_PRECEDENCE )
@RequiredArgsConstructor
@Slf4j
public class RestExceptionHandlerController {

    @ExceptionHandler( BizException.class )
    public ResponseEntity<ErrorMessage> bizExceptionHandler( BizException e ) {
        log.error( e.getMessage(), e );

        ErrorMessage errorMessage = ErrorMessage.builder()
                .code( e.getCode().getCode() )
                .message( e.getDetailMessage() )
                .build();
        // TODO 에러 유형별 로직 구현
        // ...

        return new ResponseEntity<>( errorMessage, HttpStatus.BAD_REQUEST );
    }

    @ExceptionHandler( Exception.class )
    public ResponseEntity<ErrorMessage> globalExceptionHandler( Exception e ) {
        log.error( e.getMessage(), e );

        ErrorMessage errorMessage = ErrorMessage.builder()
                .code( ExceptionCode.INTERNAL_SERVER_ERROR.getCode() )
                .message( e.getMessage() )
                .build();
        return new ResponseEntity<>( errorMessage, HttpStatus.INTERNAL_SERVER_ERROR );
    }
}
