package com.logistics.item.infrastructure.repository;

import com.logistics.item.infrastructure.repository.entity.ItemDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemMongoRepository extends MongoRepository<ItemDocument, String> {
    List<ItemDocument> findByName(String name);
}
