package com.frappe.randomlunch.domain.menu;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
@JsonInclude( JsonInclude.Include.NON_NULL )
public class MenuVO {

    // 메뉴명
    @NonNull
    private final String check;
    // 메뉴 이미지
    private final String img;

}
