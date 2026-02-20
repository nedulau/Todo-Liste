package com.lvellmet.Todo.controller;

import com.lvellmet.Todo.dtos.TodoEntryDto;
import com.lvellmet.Todo.dtos.TodoListDto;
import com.lvellmet.Todo.service.TodoListService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lists")
public class TodoListController {
    private TodoListService todoListService;

    @PostMapping
    public TodoEntryDto create(TodoListDto todoListDto) {
        return todoListService.create(todoListDto);
    }
}
