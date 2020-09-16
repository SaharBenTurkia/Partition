package com.quizz.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.quizz.app.Partition;

class TestPartition {

	private int maxSize;
	private final List<Integer> list = new ArrayList<Integer>(){{
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
          }};
          
	
	@Test
	void testList2() {
		List<Integer>[] expected = new ArrayList[3];
		maxSize = 2;
		
		for (int i = 0; i < 3; i++)
			expected[i] = new ArrayList();
		
		expected[0].add(0, 1); 
		expected[0].add(1, 2);
		
		expected[1].add(0, 3); 
		expected[1].add(1, 4);
		
		expected[2].add(0, 5);
		
		assertEquals(expected[0], Partition.Partition(list, maxSize)[0]);
		assertEquals(expected[0].size(), Partition.Partition(list, maxSize)[0].size());
		
		assertEquals(expected[1], Partition.Partition(list, maxSize)[1]);
		assertEquals(expected[1].size(), Partition.Partition(list, maxSize)[1].size());
		
		assertEquals(expected[2], Partition.Partition(list, maxSize)[2]);
		assertEquals(expected[2].size(), Partition.Partition(list, maxSize)[2].size());
		
		assertEquals(expected.length, Partition.Partition(list, maxSize).length);
		assertEquals(expected.length, 3);
	}
	
	@Test
	void testList3() {
		List<Integer>[] expected = new ArrayList[2];
		maxSize = 3; 
		
		for (int i = 0; i < 2; i++)
			expected[i] = new ArrayList();
		
		expected[0].add(0, 1); 
		expected[0].add(1, 2);
		expected[0].add(2, 3);
		
		expected[1].add(0, 4); 
		expected[1].add(1, 5);
		
		assertEquals(expected[0], Partition.Partition(list, maxSize)[0]);
		assertEquals(expected[0].size(), Partition.Partition(list, maxSize)[0].size());
		
		assertEquals(expected[1], Partition.Partition(list, maxSize)[1]);
		assertEquals(expected[1].size(), Partition.Partition(list, maxSize)[1].size());
		
		assertEquals(expected.length, Partition.Partition(list, maxSize).length);
		assertEquals(expected.length, 2);
	}
	
	@Test
	void testList1() {
		maxSize = 1;
		List<Integer>[] expected = new ArrayList[5];
		
		for (int i = 0; i < 5; i++)
			expected[i] = new ArrayList();
		
		expected[0].add(0, 1); 
		expected[1].add(0, 2);
		expected[2].add(0, 3);
		expected[3].add(0, 4);
		expected[4].add(0, 5);
		
		assertEquals(expected[0], Partition.Partition(list, maxSize)[0]);
		assertEquals(expected[0].size(), Partition.Partition(list, maxSize)[0].size());
		
		assertEquals(expected[1], Partition.Partition(list, maxSize)[1]);
		assertEquals(expected[1].size(), Partition.Partition(list, maxSize)[1].size());
		
		assertEquals(expected[2], Partition.Partition(list, maxSize)[2]);
		assertEquals(expected[2].size(), Partition.Partition(list, maxSize)[2].size());
		
		assertEquals(expected[2], Partition.Partition(list, maxSize)[2]);
		assertEquals(expected[2].size(), Partition.Partition(list, maxSize)[2].size());
		
		assertEquals(expected[3], Partition.Partition(list, maxSize)[3]);
		assertEquals(expected[3].size(), Partition.Partition(list, maxSize)[3].size());
		
		assertEquals(expected[4], Partition.Partition(list, maxSize)[4]);
		assertEquals(expected[4].size(), Partition.Partition(list, maxSize)[4].size());
		
		assertEquals(expected.length, Partition.Partition(list, maxSize).length);
		assertEquals(expected.length, 5);
	}
	
	@Test
	public void emptyListTest() {
		List<Integer> list=new ArrayList<Integer>(0);
	    assertEquals(0, Partition.Partition(list, 2).length);
	}

}
