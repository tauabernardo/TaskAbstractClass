package com.abstractclass.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Task extends BaseEntity {

    private String name;
    private String description;

    public Task() {
    }

}
