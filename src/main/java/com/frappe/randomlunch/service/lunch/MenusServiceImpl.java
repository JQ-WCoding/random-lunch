package com.frappe.randomlunch.service.lunch;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class MenusServiceImpl implements MenusService {

    @Override
    public String findMenu() {

        String name = "역삼역";
        // 식신 검색 url
        String siksinUrl = "https://www.siksinhot.com/search?keywords=" + name;
        // 다이닝 검색 url
        String diningcodeUrl = "https://www.diningcode.com/isearch.php?query=" + name;

        Document document1 = null;
        Document document2 = null;

        try {
            document1 = Jsoup.connect( siksinUrl ).get();
            document2 = Jsoup.connect( diningcodeUrl ).get();
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        String check = "";

        Element element = document1.select( "strong.store" ).first();
        Elements element2 = document2.select( "span.btxt" );

        check = element.text();
//        for ( Element elements : element ) {
//            System.out.println( elements.select( ".store" ).text() );
//            check.append( elements.select( ".store" ).text() );
//        }

        return check;
    }

    @Override
    public String findImg() throws IOException {
        String name = "역삼역";
        // 식신 검색 url
        String siksinUrl = "https://www.siksinhot.com/search?keywords=" + name;

        Document document1 = null;

        try {
            document1 = Jsoup.connect( siksinUrl ).get();
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        String img = "";

        // 첫번째 검색 태그 자식중 첫번째 값
        Element element = document1.select( "span.img" ).first().child( 0 );
        System.out.println(element);
        // 해당 태그의 src element 가져오기
        img = element.attr( "src" );

        return img;
    }

    @Override
    public void selectOneMenu() {
        Map<String, String> menu = null;
        // TODO : 목록을 전부 가져와서 하나의 음식점(메뉴)만 출력하는 알고리즘 만들기
    }

}
