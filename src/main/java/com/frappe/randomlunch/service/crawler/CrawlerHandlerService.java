package com.frappe.randomlunch.service.crawler;

import java.io.IOException;

/**
 * 크롤링 서비스
 *
 * @param <T>
 */
public interface CrawlerHandlerService<T> {

    /**
     * Crawlering Site
     *
     * @param keyword 지역정보
     * @return T
     */
    T procSearchDom( String keyword ) throws IOException;

}
