package com.quizz.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
              }};	
		int size = 2;
		System.out.println(Arrays.toString(Partition(list, size)));
	}

	public static<T> List[] Partition(List<T> list, int n)
	{
		// get size of the list
		int size = list.size();
 
		// calculate number of partitions m of size n each
		int m = size / n;
		if (size % n != 0)
			m++;
 
		// create m empty lists
		List<T>[] partition = new ArrayList[m];
		for (int i = 0; i < m; i++)
			partition[i] = new ArrayList();
 
		// process each element of the list and add it corresponding
		// list based on its position in the original list
		for (int i = 0; i < size; i++)
		{
			int index = i / n;
			partition[index].add(list.get(i));
		}
 
		// return the lists
		return partition;
	}
}
