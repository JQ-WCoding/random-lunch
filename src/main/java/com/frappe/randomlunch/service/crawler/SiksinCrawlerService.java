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
import java.util.regex.Pattern;

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

        if( StringUtils.isEmpty( keyword ) )
            throw new BizException( ExceptionCode.EMPTY_SEARCH_KEYWORD,
                    messageSourceAccessor.getMessage( ExceptionCode.EMPTY_SEARCH_KEYWORD.getCode() ) );

        Document result = Jsoup.connect( siteUrl + keyword ).get();

        Elements elements = result.head().getElementsByTag( "script" );
        for( Element el : elements ) {
            // if( !StringUtils.isEmpty( el.html() ) ) {
            // }
            log.debug( "script body -> {}", el.html() );
        }

        Element element1 = result.select( "strong.store" ).first();
        Element element2 = result.select( "span.img" ).first().child( 0 );

        String check = element1.text();
        String img = element2.attr( "src" ).split( "\\?" )[0];

        return MenuVO.builder().check( check ).img( img ).build();
    }

}
