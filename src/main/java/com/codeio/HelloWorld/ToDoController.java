package com.codeio.HelloWorld;

import com.codeio.HelloWorld.models.ToDo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    @Autowired
    private ToDoService ToDoService;
    //Path variable
    @GetMapping("search/{id}")
    ResponseEntity<ToDo> getToDoId(@PathVariable int id){
        try {
            ToDo temp = ToDoService.FindById(id);
            return new ResponseEntity<>(temp,HttpStatus.CREATED);
        }
        catch(RuntimeException exception) {
            return new ResponseEntity<>((ToDo)null,HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/create")
    ResponseEntity<ToDo> createUser(@RequestBody ToDo body){
        return new ResponseEntity<>(ToDoService.CreateUser(body),HttpStatus.CREATED);
    }
    @GetMapping("/all")
    ResponseEntity<List<ToDo>> getToDos(){
        return new ResponseEntity<List<ToDo>>(ToDoService.FindAll(),HttpStatus.ACCEPTED);
    }
    @PostMapping("/update")
    ResponseEntity<ToDo> updateUser(@RequestBody ToDo body){
        return new ResponseEntity<>(
                ToDoService.UpdateUser(body),
                HttpStatus.OK
        );
    }

    @GetMapping("/delete/{id}")
    ResponseEntity<List<ToDo>> deleteUser(@PathVariable int id){
        ToDoService.DeleteUser(id);
        return new ResponseEntity<>(
                ToDoService.FindAll(),
                HttpStatus.ACCEPTED
        );
    }
}
