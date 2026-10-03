package com.codeio.HelloWorld;

import com.codeio.HelloWorld.models.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepo ToDoRepo;

    public ToDo CreateUser(ToDo input){
        return ToDoRepo.save(input);
    }

    public ToDo FindById(int id) {
        return ToDoRepo.findById(id).orElseThrow(() -> new RuntimeException("Your id doesn't exists !"));
    }

    public List<ToDo> FindAll() {
        return ToDoRepo.findAll();
    }

    public ToDo UpdateUser(ToDo body) {
        return ToDoRepo.save(body);
    }

    public List<ToDo> DeleteUser(int id) {
        ToDoRepo.delete(ToDoRepo.getReferenceById(id));
        return ToDoRepo.findAll();
    }
}
