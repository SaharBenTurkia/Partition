package com.quizz.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition {

	public static void main(String[] args) {
		
		// initialize list = [1,2,3,4,5]
		List<Integer> list = new ArrayList<Integer>() {
			{
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}
		};
		// partition's size
		int size = 2;
		
		// display result
		System.out.println(Arrays.toString(Partition(list, size)));
	}

	public static <T> List[] Partition(List<T> list, int n) {

		int size = list.size();

		// get number of partitions m
		int m = size / n;
		if (size % n != 0)
			m++;

		// initialize m empty lists
		List<T>[] partition = new ArrayList[m];
		for (int i = 0; i < m; i++)
			partition[i] = new ArrayList();

		// process each element of the list and add it corresponding
		// list based on its position in the initial list
		for (int i = 0; i < size; i++) {
			int index = i / n;
			partition[index].add(list.get(i));
		}
		return partition;
	}
}
