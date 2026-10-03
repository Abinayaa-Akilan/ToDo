package com.codeio.HelloWorld;

import com.codeio.HelloWorld.models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ToDoRepo extends JpaRepository <ToDo, Integer>{
}
