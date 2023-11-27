package com.backend.security.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResources {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private static final List<Todo> todosList  = List.of(new Todo("abdi", "learn aws"),
    new Todo("samed", "get aws certified"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return todosList;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveAllTodos(@PathVariable String username) {
        return todosList.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable String username, @RequestBody Todo todo) {
        logger.info("creating specific todo for " +username);
    }
    

}

record Todo(String username, String description) {
}
