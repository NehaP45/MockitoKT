package com.example.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.stub.ToDoStub;

public class ToDoServiceStubTesting {

	@Test
	public void ToDOStubsTets() {
		
		TodoService ToDoStub=new ToDoStub();
		TodoBusinessImpl buss=new TodoBusinessImpl(ToDoStub);
		List val=buss.retrieveTodosRelatedToSpring("dummy");
		assertEquals(3,val.size());
		
		
		
		
		
	}

}
