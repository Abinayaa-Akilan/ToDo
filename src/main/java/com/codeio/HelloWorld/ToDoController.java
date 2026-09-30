package com.codeio.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    @Autowired
    private ToDoService service;
    @GetMapping("/get")
    String getToDo(){
        service.PrintToDo();
        return "ToDo";
    }
    //Path variable
    @GetMapping("/{id}")
    String getToDoId(@PathVariable int id){
        return "ToDo with Id "+id;
    }
    @GetMapping("")
    String getToDoIdParam(@RequestParam int id){
        return "ToDo with Id "+id;
    }
    @PostMapping("/create")
    String createUser(@RequestBody String body){
        return body;
    }
    @PutMapping("/update/{id}")
    String updateUser(@PathVariable int body){
        return "Heyy";
    }
}
