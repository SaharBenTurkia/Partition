package com.quizz.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition {

	public static void main(String[] args) {

		// initialize list = [1,2,3,4,5]
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		// partition's size
		int size = 2;

		// display result
		System.out.println(partition(list, size));
	}

	public static List<List<Integer>> partition(List<Integer> list, int n) {
		int size = list.size();

		// get number of partitions m
		int m = size / n;
		boolean pair = true;
		if (size % n != 0) {
			m++;
			pair = false;
		}

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < m; i++) {
			List<Integer> partitionList = new ArrayList<Integer>();
			if (i == m - 1 && !pair) {
				partitionList = list.subList(i * n, size);
			} else {
				partitionList = list.subList(i * n, n * (i + 1));
			}
			result.add(partitionList);
		}
		return result;
	}
}
