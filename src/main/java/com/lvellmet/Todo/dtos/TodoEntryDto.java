package com.lvellmet.Todo.dtos;

import com.lvellmet.Todo.entities.TodoListEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TodoEntryDto extends SuperDto {
    private Long todoListId;
    private Boolean done;
    private Boolean favorite;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
