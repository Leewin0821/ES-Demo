package com.tw.leewin.esdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Log4j
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "es-items", type = "item", shards = 2, refreshInterval = "-1")
public class Item {
    @Id
    private String id;
    private String name;
    private String description;
}
