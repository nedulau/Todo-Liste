package com.lvellmet.Todo.dtos;

import com.lvellmet.Todo.entities.TodoEntryEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TodoListDto extends SuperDto {
    List<TodoEntryDto> todoEntries;
}
