package com.frappe.randomlunch.domain.lunch;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
// @Entity
public class Menus {
   // @Id
   private Long id;

   private String food;

   private String image;

   private String location;

   @Builder
   public Menus(String food, String image, String location) {
       this.food = food;
       this.image = image;
       this.location = location;
   }
}
