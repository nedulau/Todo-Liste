package com.lvellmet.Todo.mapper;

import com.lvellmet.Todo.dtos.TodoListDto;
import com.lvellmet.Todo.entities.TodoListEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring", uses = {TodoEntryMapper.class})
public interface TodoListMapper {
    TodoListDto toDto(TodoListEntity entity);

    @Mapping(target="todoEntries", ignore=true)
    TodoListEntity toEntity(TodoListDto dto);
}
