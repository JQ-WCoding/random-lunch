package com.frappe.randomlunch.domain.menu;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode( callSuper = false )
public class MenuVO {
    // 메뉴명
    private String menu;

    // 도로명
    private String location;
}
