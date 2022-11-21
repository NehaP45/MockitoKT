package com.example.stub;

import java.util.Arrays;
import java.util.List;

import com.example.service.TodoService;

public class ToDoStub  implements TodoService{

	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}

	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}

}
