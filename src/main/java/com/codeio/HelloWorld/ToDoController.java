package com.codeio.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    @GetMapping("/get")
    String getToDo(){
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
}
