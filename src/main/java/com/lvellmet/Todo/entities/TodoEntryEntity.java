package com.lvellmet.Todo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name="todo_entry")
public class TodoEntryEntity extends SuperEntity {
    @ManyToOne
    @JoinColumn(name="todo_list_id")
    private TodoListEntity todoList;

    @Column(name="done")
    private Boolean done;

    @Column(name="favorite")
    private Boolean favorite;

    @Column(name="due_date")
    private LocalDateTime dueDate;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;
}
