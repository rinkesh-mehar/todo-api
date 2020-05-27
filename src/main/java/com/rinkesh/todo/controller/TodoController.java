package com.rinkesh.todo.controller;

import com.rinkesh.todo.entity.Todo;
import com.rinkesh.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

	@GetMapping("/users/{userName}/todo/{id}")
	public Todo getTodo(@PathVariable String userName, @PathVariable long id)
	{
		return todoService.findById(id);
	}

	/**
	 * Update todo
	 *
	 * @param userName
	 * @param id
	 * @param todo
	 * @return
	 */
	@PutMapping("/users/{userName}/todo/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String userName, @PathVariable long id, @RequestBody Todo todo)
	{
		Todo updatedTodo = todoService.saveTodo(todo);
		return new ResponseEntity<Todo>(updatedTodo, HttpStatus.OK);
	}

	/**
	 * Create todo
	 *
	 * @return location with help of id
	 */
	@PostMapping("/users/{userName}/todo")
	// public ResponseEntity<Void> createTodo(@PathVariable String userName, @RequestBody Todo todo)
	public ResponseEntity<Void> createTodo(@PathVariable String userName, @RequestBody Todo todo)
	{

		// {
		Todo createdTodo = todoService.saveTodo(todo);

		/**
		 * appending /id to {id}
		 *  URI Location
		 *  Get current resource url using servletUriComponentBuilder
		 */

		   // URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
		//
		// return ResponseEntity.created(uri).build();
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
}
