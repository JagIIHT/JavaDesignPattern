package com.dp.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<String> l = Arrays.asList(new String[] {"Hello", "All"});
		ListIterator<String> itr = new ListIterator<String>(l);
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
