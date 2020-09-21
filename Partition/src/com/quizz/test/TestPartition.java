package com.quizz.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.quizz.app.Partition;

class TestPartition {

	private int maxSize;
	private final List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

	@Test
	void testList2() {
		// test list with max size = 2
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		maxSize = 2;

		expected.add(new ArrayList<Integer>(Arrays.asList(1, 2)));
		expected.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
		expected.add(new ArrayList<Integer>(Arrays.asList(5)));

		assertEquals(expected, Partition.partition(list, maxSize));
	}

	@Test
	void testList3() {
		// test list with max size = 3
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		maxSize = 3;

		expected.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		expected.add(new ArrayList<Integer>(Arrays.asList(4, 5)));

		assertEquals(expected, Partition.partition(list, maxSize));
	}

	@Test
	void testList1() {
		// test list with max size = 1
		maxSize = 1;
		List<List<Integer>> expected = new ArrayList<List<Integer>>();

		expected.add(new ArrayList<Integer>(Arrays.asList(1)));
		expected.add(new ArrayList<Integer>(Arrays.asList(2)));
		expected.add(new ArrayList<Integer>(Arrays.asList(3)));
		expected.add(new ArrayList<Integer>(Arrays.asList(4)));
		expected.add(new ArrayList<Integer>(Arrays.asList(5)));

		assertEquals(expected, Partition.partition(list, maxSize));
	}

	@Test
	public void emptyListTest() {
		List<Integer> list = new ArrayList<Integer>(0);
		assertEquals(0, Partition.partition(list, 2).size());
	}

}
