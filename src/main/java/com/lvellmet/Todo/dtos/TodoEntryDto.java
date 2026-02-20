package com.lvellmet.Todo.dtos;

import com.lvellmet.Todo.entities.TodoListEntity;
import java.time.LocalDateTime;

public class TodoEntryDto extends SuperDto {
    private TodoListEntity todoListId;
    private Boolean done;
    private Boolean favorite;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
