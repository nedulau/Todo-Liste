package com.lvellmet.Todo.service;

import com.lvellmet.Todo.dtos.TodoListDto;
import com.lvellmet.Todo.entities.TodoListEntity;
import com.lvellmet.Todo.mapper.TodoListMapper;
import com.lvellmet.Todo.repositories.TodoListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListService {

    private TodoListRepository todoListRepository;
    private TodoListMapper todoListMapper;

    public TodoListService(TodoListRepository todoListRepository, TodoListMapper todoListMapper) {
        this.todoListRepository = todoListRepository;
        this.todoListMapper = todoListMapper;
    }

    public TodoListDto saveTodoList(TodoListDto dto) {
        TodoListEntity entity = todoListMapper.toEntity(dto);
        return todoListMapper.toDto(entity);
    }

    public List<TodoListDto> getAll() {

    }

    public TodoListDto getTodoListById(Long listId) {
        TodoListEntity entity = todoListRepository.findById(listId)
                .orElseThrow(() -> new RuntimeException("Liste nicht gefunden: " + listId)); // das ist noetig da findById() Optional<TodoListEntity> zurueckgibt
        return todoListMapper.toDto(entity);
    }

    public TodoListEntity updateTodoList(TodoListEntity todoListEntity) {
        return todoListRepository.save(todoListEntity); // nicht fertig
    }

    public void deleteTodoList(Long listId) {
        todoListRepository.deleteById(listId);
    }

}
