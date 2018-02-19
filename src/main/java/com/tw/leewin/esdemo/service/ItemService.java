package com.tw.leewin.esdemo.service;

import com.google.common.collect.Lists;
import com.tw.leewin.esdemo.model.Item;
import com.tw.leewin.esdemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void saveItem() {
        itemRepository.save(Lists.newArrayList(new Item("1", "Lee", "Win"), new Item("2", "Awe", "Some")));
    }


    public List<Item> fetchAllByName(String name) {
        final Optional<List<Item>> itemsByName = itemRepository.findItemsByName(name);
        return itemsByName.orElseGet(Lists::newArrayList);
    }

    public Item fetchById(String id) {
        final Optional<Item> itemById = itemRepository.findById(id);
        return itemById.orElseGet(Item::new);
    }
}
