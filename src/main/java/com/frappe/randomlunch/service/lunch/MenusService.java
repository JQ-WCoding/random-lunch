package com.frappe.randomlunch.service.lunch;

import com.frappe.randomlunch.domain.menu.MenuVO;

import java.io.IOException;
import java.util.List;

public interface MenusService {
    /**
     * 메뉴 가져오기
     * @return
     * @throws IOException
     */
    String findMenu() throws IOException;

    /**
     * 해당 메뉴 이미지 가져오기
     * @return
     * @throws IOException
     */
    String findImg() throws  IOException;
}
