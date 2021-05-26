package com.frappe.randomlunch.service.lunch;

import com.frappe.randomlunch.domain.lunch.Menus;
import com.frappe.randomlunch.domain.lunch.MenusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;

@RequiredArgsConstructor
@Service
public class MenusService {
    private final MenusRepository menusRepository;

//     @Transactional
//     public Menus save() {
//         return menusRepository.save();
//     }
//
//     @Transactional
//     public Long update(Long id,) {
//         Menus menus = menusRepository.findById( id ).orElseThrow( () -> new IllegalArgumentException( "" ) );
//
//         return id;
//     }
// }
