package com.logistics.item.infrastructure.repository.mapper;

import com.logistics.item.domain.Item;
import com.logistics.item.infrastructure.repository.entity.ItemDocument;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemEntityMapper {
    ItemDocument fromDomain(Item in);

    Item toDomain(ItemDocument in);
}
