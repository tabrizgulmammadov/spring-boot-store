package com.tabrizgulmammadov.store.mappers;

import com.tabrizgulmammadov.store.dtos.RegisterUserRequest;
import com.tabrizgulmammadov.store.dtos.UpdateUserRequest;
import com.tabrizgulmammadov.store.dtos.UserDto;
import com.tabrizgulmammadov.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
