package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindListStream {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10);
		List<Integer>result=list.stream().filter(i->i>5).collect(Collectors.toList());
		
		System.out.print(result);
	}

}
