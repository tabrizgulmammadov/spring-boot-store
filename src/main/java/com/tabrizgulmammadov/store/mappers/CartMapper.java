package com.tabrizgulmammadov.store.mappers;

import com.tabrizgulmammadov.store.dtos.CartDto;
import com.tabrizgulmammadov.store.dtos.CartItemDto;
import com.tabrizgulmammadov.store.entities.Cart;
import com.tabrizgulmammadov.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
