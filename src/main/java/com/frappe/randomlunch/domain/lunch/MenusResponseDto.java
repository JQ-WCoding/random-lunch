package com.frappe.randomlunch.domain.lunch;

import lombok.Getter;

@Getter
public class MenusResponseDto {
   private Long id;
   private String food;
   private String image;
   private String location;

   public MenusResponseDto(Menus entity) {
       this.id = entity.getId();
       this.food = entity.getFood();
       this.image = entity.getImage();
       this.location = entity.getLocation();
   }
}
