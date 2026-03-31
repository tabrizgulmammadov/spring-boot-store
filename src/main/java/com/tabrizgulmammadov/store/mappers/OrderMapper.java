package com.tabrizgulmammadov.store.mappers;

import com.tabrizgulmammadov.store.dtos.OrderDto;
import com.tabrizgulmammadov.store.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
