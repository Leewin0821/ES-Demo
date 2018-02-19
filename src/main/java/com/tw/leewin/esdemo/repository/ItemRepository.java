package com.tw.leewin.esdemo.repository;

import com.tw.leewin.esdemo.model.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends ElasticsearchRepository<Item, String> {
    public Optional<List<Item>> findItemsByName(String name);
    public Optional<Item> findById(String id);
}
