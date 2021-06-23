package com.frappe.randomlunch.service.lunch;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.net.URL;

@RequiredArgsConstructor
@Service
public class MenusServiceImpl implements MenusService {

    /**
     * 메뉴 찾아서 보내주기
     *
     * @return
     */
    @Override
    public String findMenu() {

        String name = "역삼역";
        // 식신 검색 url
        String siksinUrl = "https://www.siksinhot.com/search?keywords=" + name;
        // 다이닝 검색 url
        String diningcodeUrl = "https://www.diningcode.com/isearch.php?query=" + name;

        // 임시 이미지 루트
        String imgRoot = "C:\\Users\\reno\\Pictures\\test";
        Document document1 = null;
        Document document2 = null;

        /*
         * TODO : 이미지 파일 로컬 저장 및 해당 루트 String 으로 보내기
         * iterator 사용해보기? tag 제외 후 본문만 가져올 수 있는 방법
         */


        // 이미지 버퍼 선언
        BufferedImage img = null;

        try {
            document1 = Jsoup.connect( siksinUrl ).get();
            document2 = Jsoup.connect( diningcodeUrl ).get();
            URL imgUrl = new URL( "https://img.siksinhot.com/place/1458027947166169.PNG" );
            img = ImageIO.read( imgUrl );

            FileOutputStream outputStream = new FileOutputStream( imgRoot );

            ImageIO.write( img, "png", outputStream );

        } catch ( Exception e ) {
            e.printStackTrace();
        }

        StringBuilder check = new StringBuilder();

        Elements element = document1.select( "strong.store" );
        Elements element2 = document2.select( "span.btxt" );
        for ( Element elements : element ) {
            System.out.println( elements.select( ".store" ) );
            check.append( elements.select( ".store" ) );
        }

        return check.toString();
    }
}
