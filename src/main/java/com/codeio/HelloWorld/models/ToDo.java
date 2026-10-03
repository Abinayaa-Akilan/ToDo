package com.codeio.HelloWorld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ToDo {
    @Id
    @GeneratedValue
    int id;
    String title;
    String Description;
    Boolean isCompleted;
}
