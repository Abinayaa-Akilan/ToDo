package com.codeio.HelloWorld;

import org.springframework.stereotype.Component;

@Component
public class ToDoRepo {  
    String AllToDo() {
        return "Hello I'm ToDo";
    }
}
