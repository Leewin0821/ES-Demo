package com.tw.leewin.esdemo.controller;

import com.tw.leewin.esdemo.domain.Item;
import com.tw.leewin.esdemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() {
        itemService.saveItem();
        final List<Item> fetchItemsByName = itemService.fetchAllByName("Awe");
        final Item item = itemService.fetchById("1");
        fetchItemsByName.forEach((item1 -> System.out.println(item1.getDescription())));
        System.out.println(item.getDescription());
    }
}
