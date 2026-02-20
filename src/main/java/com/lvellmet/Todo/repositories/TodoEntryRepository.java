package com.lvellmet.Todo.repositories;

import com.lvellmet.Todo.entities.TodoEntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoEntryRepository extends JpaRepository<TodoEntryEntity, Long> {
}
