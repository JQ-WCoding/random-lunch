package com.frappe.randomlunch.service.crawler;

import com.frappe.randomlunch.config.aop.exception.BizException;
import com.frappe.randomlunch.config.aop.exception.ExceptionCode;
import com.frappe.randomlunch.domain.menu.MenuVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 식신 사이트 크롤링 서비스
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SiksinCrawlerService implements CrawlerHandlerService<MenuVO> {

    private final MessageSourceAccessor messageSourceAccessor;

    @Value( "${crawler.site.siksinhot}" )
    private String siteUrl;

    @Override
    public MenuVO procSearchDom( String keyword ) throws IOException {

        // 예외처리
        if ( StringUtils.isEmpty( keyword ) )
            throw new BizException( ExceptionCode.EMPTY_SEARCH_KEYWORD,
                    messageSourceAccessor.getMessage( ExceptionCode.EMPTY_SEARCH_KEYWORD.getCode() ) );

        // 검색 사이트 Keyword 검색
        Document result = Jsoup.connect( siteUrl + keyword ).get();

        Elements elements = result.head().getElementsByTag( "script" );
        for( Element el : elements ) {
            // if( !StringUtils.isEmpty( el.html() ) ) {
            // }
            log.debug( "script body -> {}", el.html() );
        }

        // TODO : Elements 로 변경
        // 음식점명 가져오기
        Element element1 = result.select( "strong.store" ).first();
        Element element2 = result.select( "span.img" ).first().child( 0 );

        // TODO : 반복문을 통해 count 증가 및 Map 으로 보내기
        String check = element1.text();
        // 사진 크기 원본 가져오기
        String img = element2.attr( "src" ).split( "\\?" )[0];

        return MenuVO.builder().check( check ).img( img ).count( 1 ).build();
    }

}
