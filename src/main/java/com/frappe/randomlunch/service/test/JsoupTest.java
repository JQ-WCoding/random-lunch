package com.frappe.randomlunch.service.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
    public void test() {
        String url = "https://www.naver.com";
         Document document = null;
        try {
            document = Jsoup.connect( url ).get();
            Elements elements = document.select("");
            System.out.println(elements);
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
