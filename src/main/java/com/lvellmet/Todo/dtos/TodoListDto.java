package com.lvellmet.Todo.dtos;

import com.lvellmet.Todo.entities.TodoEntryEntity;
import java.util.List;

public class TodoListDto extends SuperDto {
    List<TodoEntryEntity> todoEntries;
}
