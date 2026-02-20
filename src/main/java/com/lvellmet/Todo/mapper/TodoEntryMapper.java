package com.lvellmet.Todo.mapper;

import com.lvellmet.Todo.dtos.TodoEntryDto;
import com.lvellmet.Todo.entities.TodoEntryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface TodoEntryMapper {
    @Mapping(source="todoList.id", target="todoListId")
    TodoEntryDto toDto(TodoEntryEntity entity);

    @Mapping(target="todoList", ignore=true)
    TodoEntryEntity toEntity(TodoEntryDto dto);
}
