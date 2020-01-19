package com.dp.behavioral.iterator;

import java.util.List;

public class ListIterator<E> implements Iterator {

	List<E> list;
	int i = 0;
	public ListIterator(List<E> l) {
		this.list = l;
	}
	@Override
	public boolean hasNext() {
		return this.list.size() > i;
	}

	@Override
	public Object next() {
		if (hasNext()) {
			return this.list.get(i++);
		}
		return null;
	}
}
