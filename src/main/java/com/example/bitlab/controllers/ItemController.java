package com.example.bitlab.controllers;

import com.example.bitlab.entity.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {
    @GetMapping("/home")
    public String mainPage(Model model){
        List<Item> items = new ArrayList<>();
        items.add(Item.builder().id(1L).name("Mac Book Pro").description("8 GB RAM 255 GB SSD Intel Core i7").price(1199.99).build());
        items.add(Item.builder().id(2L).name("Mac Book Pro").description("16 GB RAM 500 GB SSD Apple M1").price(1499.99).build());
        items.add(Item.builder().id(3L).name("Mac Book Pro").description("16 GB RAM 1 GB SSD Apple M1").price(1799.99).build());
        items.add(Item.builder().id(4L).name("ASUS Tuf Gaming").description("16 GB RAM 500 GB SSD Intel Core i7").price(1299.99).build());
        items.add(Item.builder().id(5L).name("HP Laser Pro").description("8 GB RAM 500 GB SSD Intel Core i5").price(999.99).build());
        items.add(Item.builder().id(6L).name("Lenovo Legion").description("32 GB RAM 512 GB SSD Intel Core i7").price(1399.99).build());
        model.addAttribute("items", items);
        return "home";
    }

}
