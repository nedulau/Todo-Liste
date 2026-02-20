package com.lvellmet.Todo.service;

import com.lvellmet.Todo.entities.TodoListEntity;
import com.lvellmet.Todo.repositories.TodoListRepository;

public class TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListEntity addTodoList(TodoListEntity todoListEntity) {
        return todoListRepository.save(todoListEntity);
    }


}
