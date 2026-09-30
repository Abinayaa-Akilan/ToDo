package com.codeio.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo ToDoRepo;
    public void PrintToDo(){
        System.out.println(ToDoRepo.AllToDo());
    }
}
