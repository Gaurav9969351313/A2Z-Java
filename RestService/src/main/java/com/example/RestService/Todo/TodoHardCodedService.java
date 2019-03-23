package com.example.RestService.Todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	
	private static List<Todo> todos = new ArrayList();
	private static long idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter,"Gaurav Talele","Learn Spring Boot",false,new Date()));
		todos.add(new Todo(++idCounter,"Gaurav Talele","Learn Angular",false,new Date()));
		todos.add(new Todo(++idCounter,"Gaurav Talele","Complete ToDo Project",false,new Date()));
		todos.add(new Todo(++idCounter,"Gaurav Talele","Spring Boot With Redis",false,new Date()));
		todos.add(new Todo(++idCounter,"Gaurav Talele","Spring Boot With firebase",false,new Date()));
		todos.add(new Todo(++idCounter,"Gaurav Talele","Spring Boot With mongodb",false,new Date()));
	}
	
	public List<Todo> findAll() {
		return todos;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	
	public Todo deleteById(long id) {
		
		Todo todo = findById(id);
		
		if(todo == null)
			return null;
					
		
		if(todos.remove(todo))
			return todo;
		
		return null;
	}

	public Todo save(Todo todo) {
		if (todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
}
