package com.example.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class ToDoMocksTest {

	@Test
	public void ToDOMocksTestig() {
		
		TodoService todoMock=mock(TodoService.class);
		List l=Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
		when(todoMock.retrieveTodos("dummy")).thenReturn(l);
		TodoBusinessImpl buss=new TodoBusinessImpl(todoMock);
		List val=buss.retrieveTodosRelatedToSpring("dummy");
		
		assertEquals(2,val.size());
		
		
		
		
	}
	@Test
	public void ToDOMocksTestigUsingVerify() {
		
		TodoService todoMock=mock(TodoService.class);
		List l=Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to code");
		when(todoMock.retrieveTodos("dummy")).thenReturn(l);
		TodoBusinessImpl buss=new TodoBusinessImpl(todoMock);
		buss.deleteTodosNotRelatedToSpring("dummy");
		//verify(todoMock).deleteTodo("Learn to Dance");
		
		
		
		
		
		
	}
	@Test
	public void ToDOMocksTestigUsingArgsCaptor() {
		
		TodoService todoMock=mock(TodoService.class);
		ArgumentCaptor<String> cap=ArgumentCaptor.forClass(String.class);
		List l=Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
		when(todoMock.retrieveTodos("dummy")).thenReturn(l);
		TodoBusinessImpl buss=new TodoBusinessImpl(todoMock);
		buss.deleteTodosNotRelatedToSpring("dummy");
		verify(todoMock).deleteTodo(cap.capture());
		System.out.println(cap.getValue());
		
		
		
		
		
		
	}

}
