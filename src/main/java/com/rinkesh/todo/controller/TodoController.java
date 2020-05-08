package com.rinkesh.todo.controller;

import com.rinkesh.todo.entity.Todo;
import com.rinkesh.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController
{
	@Autowired
	private TodoService todoService;

	// TodoController(final TodoService todoService)
	// {
	// 	this.todoService = todoService;
	// }

	@GetMapping("/users/{userName}/todos")
	public List<Todo> getAllTodo(@PathVariable String userName)
	{
		return todoService.findAll();
	}

	@DeleteMapping("/users/{userName}/todo/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String userName, @PathVariable long id)
	{
		Todo todo = todoService.deleteById(id);
		if (todo != null)
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
}
