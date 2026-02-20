package com.lvellmet.Todo.repositories;

import com.lvellmet.Todo.entities.TodoListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoListRepository extends JpaRepository<TodoListEntity, Long> {
}
