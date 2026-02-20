package com.lvellmet.Todo.controller;

import com.lvellmet.Todo.dtos.TodoEntryDto;
import com.lvellmet.Todo.service.TodoEntryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoEntryController {
    private TodoEntryService todoEntryService;

    @PostMapping("/lists/{listId}/entries")
    public TodoEntryDto create(@PathVariable Long listId, TodoEntryDto todoEntryDto) {

    }

    @GetMapping("/lists/{listId}/entries")
    public List<TodoEntryDto> getAll(@PathVariable Long listId) {

    }

    @GetMapping("/todo/{id}")
    public TodoEntryDto get(@PathVariable Long entryId) {

    }

    @PutMapping("/todo/{id}")
    public TodoEntryDto update(@PathVariable Long id, TodoEntryDto todoEntryDto) {

    }

    @PatchMapping("/todo/{id}")
    public TodoEntryDto partialUpdate(@PathVariable Long id, TodoEntryDto todoEntryDto) {

    }

    @DeleteMapping("/todo/{id}")
    public void delete(@PathVariable Long id) {

    }


}
