package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateStream {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		Collections.addAll(list, 1,2,3,4,2,5,4);
		Set<Integer> set= new HashSet<Integer>();
		
		List<Integer> duplicate=list.stream()
				.filter(i->!set.add(i))
				.collect(Collectors.toList());
		
		System.out.println(duplicate);
		
		
	}

}
