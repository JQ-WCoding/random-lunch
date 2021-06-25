package com.frappe.randomlunch.config.aop.exception;

import lombok.Getter;

/**
 * 에러 유형
 */
@Getter
public enum ExceptionCode {

    /**
     * 지역정보가 없습니다.
     */
    EMPTY_SEARCH_KEYWORD( "EC400" ),
    INTERNAL_SERVER_ERROR( "EC500" );

    private final String code;

    ExceptionCode( String code ) {
        this.code = code;
    }

}
