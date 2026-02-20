package com.lvellmet.Todo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name="todo_list")
public class TodoListEntity extends SuperEntity {
    @OneToMany(mappedBy = "todoListId", cascade = CascadeType.ALL, orphanRemoval = true)
    List<TodoEntryEntity> todoEntries;
}
