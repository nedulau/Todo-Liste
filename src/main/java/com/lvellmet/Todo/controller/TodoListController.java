package com.lvellmet.Todo.controller;

import com.lvellmet.Todo.dtos.TodoEntryDto;
import com.lvellmet.Todo.dtos.TodoListDto;
import com.lvellmet.Todo.service.TodoListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lists")
public class TodoListController {
    private TodoListService todoListService;

    @PostMapping("")
    public TodoEntryDto create(TodoListDto todoListDto) {
        return todoListService.saveTodoList(todoListDto);
    }

    @GetMapping("")
    public List<TodoListDto> getAll() {
        return todoListService.getAll();
    }

    @GetMapping("/{listId}")
    public TodoListDto get(@PathVariable Long listId) {
        return todoListService.getTodoListById(listId);
    }

    @PutMapping("/{listId}")
    public TodoListDto update(@PathVariable Long listId, TodoListDto todoListDto) {

    }

    @PatchMapping("/{listId}")
    public TodoListDto partialUpdate(@PathVariable Long listId, TodoListDto todoListDto) {

    }

    @DeleteMapping("/{listId}")
    public void delete(@PathVariable Long listId) {

    }
}
