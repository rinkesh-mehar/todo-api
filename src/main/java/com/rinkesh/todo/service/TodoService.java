package com.rinkesh.todo.service;

import com.rinkesh.todo.entity.Todo;
import com.rinkesh.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoService
{
	@Autowired
	TodoRepository todoRepository;

	private static List<Todo> todos = new ArrayList<>();
	private static long idCount = 0;

	static
	{
		todos.add(new Todo(++idCount, "rinkesh", "learn to code", new Date(), false));
		todos.add(new Todo(++idCount, "rinkesh", "learn to microservices", new Date(), false));
		todos.add(new Todo(++idCount, "rinkesh", "learn to angular", new Date(), false));
	}

	public List<Todo> findAll()
	{
		return todos;
	}

	public List<Todo> findAllByJpa()
	{
		return todoRepository.findAll();
	}

	public Todo deleteById(long id)
	{
		Todo todo = findById(id);

		if (todo == null)
		{ return null; }
		if (todos.remove(todo))
		{
			return todo;
		}
		return null;
	}

	public Todo findById(final long id)
	{
		for (Todo todo : todos)
		{
			if (todo.getId() == id)
			{
				return todo;
			}
		}
		return null;
	}

	public Todo saveTodo(Todo todo)
	{
		if (todo.getId() == -1 || todo.getId() == 0)
		{
			todo.setId(++idCount);
			todos.add(todo);
		}
		else
		{
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

}
