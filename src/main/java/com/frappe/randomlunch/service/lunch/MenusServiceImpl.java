package com.frappe.randomlunch.service.lunch;

import com.frappe.randomlunch.domain.menu.MenuVO;
import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MenusServiceImpl implements MenusService {

    /**
     * 메뉴 찾아서 보내주기
     *
     * @return
     */
    @Override
    public String findMenu() throws IOException {
        String name = "역삼역";
        String url = "https://www.siksinhot.com/search?keywords=" + name;
        Document document = null;
        try {
            document = Jsoup.connect( url ).get();
        } catch ( Exception e ) {
            e.printStackTrace();
        }
        StringBuilder check = new StringBuilder();

        Elements element = document.select( "strong.store" );
        for ( Element elements : element ) {
            System.out.println( elements.select( ".store" ) );
            check.append( elements.select( ".store" ) );
        }

        return check.toString();
    }
}
