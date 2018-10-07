package com.example.demo.controllers;

import com.example.demo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {

    @RequestMapping("/search/**")
    @ResponseBody
    public List returnItems(@RequestParam(value="item", defaultValue="all") String name) {
        List itemList = new ArrayList<Item>();

        itemList.add(new Item(1,"Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(2,"Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(3,"Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(4,"Cup", "assets/images/cup.jpeg",""));
        itemList.add(new Item(6,"Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(7,"Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(8,"Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(9,"Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(10,"Cup", "assets/images/cup.jpeg",""));
        itemList.add(new Item(11,"Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(12,"Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(13,"Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(14,"Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(15,"Cup", "assets/images/cup.jpeg",""));
        itemList.add(new Item(16,"Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(17,"Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(18,"Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(19,"Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(20,"Cup", "assets/images/cup.jpeg",""));
        itemList.add(new Item(21,"Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(22,"Bowl", "assets/images/bowl.jpeg", ""));

        return itemList;
    }
}