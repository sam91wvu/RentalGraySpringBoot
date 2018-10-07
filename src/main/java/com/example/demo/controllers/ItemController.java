package com.example.demo.controllers;

import com.example.demo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @RequestMapping("/viewItem/**")
    @ResponseBody
    public Item viewItem(@RequestParam(value="id", defaultValue="all") String id) {
        Item item = new Item(1,"Table", "assets/images/table.jpeg", "This is a table picture.");
        return item;
    }
}