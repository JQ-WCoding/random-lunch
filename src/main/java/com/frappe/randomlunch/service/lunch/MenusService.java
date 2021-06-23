package com.frappe.randomlunch.service.lunch;

import com.frappe.randomlunch.domain.menu.MenuVO;

import java.io.IOException;
import java.util.List;

public interface MenusService {
    String findMenu() throws IOException;
}
