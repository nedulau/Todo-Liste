package com.lvellmet.Todo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SuperDto {
    protected long id;
    protected String name;
}
