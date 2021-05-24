package com.frappe.randomlunch.service.lunch;

import com.frappe.randomlunch.domain.lunch.Menus;
import com.frappe.randomlunch.domain.lunch.MenusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MenusService {
    private final MenusRepository menusRepository;
}
