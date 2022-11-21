package com.example.list;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
	List lmock=mock(List.class);
	when(lmock.size()).thenReturn(5);
	assertEquals(5,lmock.size());
	
	}
	
	@Test
	public void MultipleReturns() {
	List lmock=mock(List.class);
	when(lmock.size()).thenReturn(5).thenReturn(10);
	assertEquals(5,lmock.size());
	assertEquals(10,lmock.size());
	
	}
	
	@Test
	public void ArgMatch() {
	List lmock=mock(List.class);
	when(lmock.get(anyInt())).thenReturn(5);
	assertEquals(5,lmock.get(12));
	//assertEquals(10,lmock.size());
	
	}
	

}
