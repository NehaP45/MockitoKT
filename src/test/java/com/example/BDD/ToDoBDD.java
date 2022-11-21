package com.example.BDD;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.
import static org.mockito.BDDMockito.given;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.service.TodoBusinessImpl;
import com.example.service.TodoService;

public class ToDoBDD {

	@Test
	public void test() {
		
		//given
		
		TodoService todoMock=mock(TodoService.class);
		List l=Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
		given(todoMock.retrieveTodos("dummy")).willReturn(l);
		TodoBusinessImpl buss=new TodoBusinessImpl(todoMock);
		
		//when
		
		List val=buss.retrieveTodosRelatedToSpring("dummy");
		//then
		
		assertEquals(2,val.size());
		
	
		
		
		
	}

}
